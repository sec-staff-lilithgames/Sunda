/* GLIB - Library of useful routines for C programming
 * Copyright (C) 1995-1997  Peter Mattis, Spencer Kimball and Josh MacDonald
 *
 * gpoll.c: poll(2) abstraction
 * Copyright 1998 Owen Taylor
 * Copyright 2008 Red Hat, Inc.
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.	 See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

/*
 * Modified by the GLib Team and others 1997-2000.  See the AUTHORS
 * file for a list of people on the GLib Team.  See the ChangeLog
 * files for a list of changes.  These files are distributed with
 * GLib at ftp://ftp.gtk.org/pub/gtk/.
 */

/*
 * MT safe
 */

#include "config.h"
#include "glibconfig.h"
#include "giochannel.h"

/* Uncomment the next line (and the corresponding line in gmain.c) to
 * enable debugging printouts if the environment variable
 * G_MAIN_POLL_DEBUG is set to some value.
 */
/* #define G_MAIN_POLL_DEBUG */

#include <sys/types.h>
#include <time.h>
#include <stdlib.h>
#ifdef HAVE_SYS_TIME_H
#include <sys/time.h>
#endif /* HAVE_SYS_TIME_H */
#ifdef HAVE_POLL
#  include <poll.h>

/* The poll() emulation on OS/X doesn't handle fds=NULL, nfds=0,
 * so we prefer our own poll emulation.
 */
#if defined(_POLL_EMUL_H_) || defined(BROKEN_POLL)
#undef HAVE_POLL
#endif

#endif /* GLIB_HAVE_SYS_POLL_H */
#ifdef G_OS_UNIX
#include <unistd.h>
#endif /* G_OS_UNIX */
#include <errno.h>

#ifdef G_OS_WIN32
#define STRICT
#include <windows.h>
#include <process.h>
#endif /* G_OS_WIN32 */

#include "gpoll.h"

#ifdef G_OS_WIN32
#include "gprintf.h"
#endif

#ifdef HAVE_KQUEUE
#include "galloca.h"
#include "gprintf.h"
#include "gwakeup-private.h"
#include <sys/event.h>
#endif

#ifdef G_OS_NONE
#include "gdatetime.h"
#include "gmessages.h"
#include "gwakeup-private.h"
#include "gwait.h"
#endif

#ifdef G_DISABLE_CHECKS
#include "glib-nolog.h"
#endif

#ifdef G_MAIN_POLL_DEBUG
extern gboolean _g_main_poll_debug;
#endif

#if defined (HAVE_POLL) && !defined (HAVE_KQUEUE)

/**
 * g_poll:
 * @fds: file descriptors to poll
 * @nfds: the number of file descriptors in @fds
 * @timeout: amount of time to wait, in milliseconds, or -1 to wait forever
 *
 * Polls @fds, as with the poll() system call, but portably. (On
 * systems that don't have poll(), it is emulated using select().)
 * This is used internally by #GMainContext, but it can be called
 * directly if you need to block until a file descriptor is ready, but
 * don't want to run the full main loop.
 *
 * Each element of @fds is a #GPollFD describing a single file
 * descriptor to poll. The @fd field indicates the file descriptor,
 * and the @events field indicates the events to poll for. On return,
 * the @revents fields will be filled with the events that actually
 * occurred.
 *
 * On POSIX systems, the file descriptors in @fds can be any sort of
 * file descriptor, but the situation is much more complicated on
 * Windows. If you need to use g_poll() in code that has to run on
 * Windows, the easiest solution is to construct all of your
 * #GPollFDs with g_io_channel_win32_make_pollfd().
 *
 * Returns: the number of entries in @fds whose @revents fields
 * were filled in, or 0 if the operation timed out, or -1 on error or
 * if the call was interrupted.
 *
 * Since: 2.20
 **/
gint
g_poll (GPollFD *fds,
	guint    nfds,
	gint     timeout)
{
  return poll ((struct pollfd *)fds, nfds, timeout);
}

#else	/* !HAVE_POLL */

#ifdef G_OS_WIN32

static int
poll_rest (GPollFD *msg_fd,
           GPollFD *stop_fd,
           HANDLE  *handles,
           GPollFD *handle_to_fd[],
           gint     nhandles,
           DWORD    timeout_ms)
{
  DWORD ready;
  GPollFD *f;
  int recursed_result;

  if (msg_fd != NULL)
    {
      /* Wait for either messages or handles
       * -> Use MsgWaitForMultipleObjectsEx
       */
#ifdef G_MAIN_POLL_DEBUG
      if (_g_main_poll_debug)
	g_print ("  MsgWaitForMultipleObjectsEx(%d, %lu)\n", nhandles, timeout_ms);
#endif

      ready = MsgWaitForMultipleObjectsEx (nhandles, handles, timeout_ms,
					   QS_ALLINPUT, MWMO_ALERTABLE);

      if (ready == WAIT_FAILED)
	{
	  gchar *emsg = g_win32_error_message (GetLastError ());
	  g_warning ("MsgWaitForMultipleObjectsEx failed: %s", emsg);
	  g_free (emsg);
	}
    }
  else if (nhandles == 0)
    {
      /* No handles to wait for, just the timeout */
      if (timeout_ms == INFINITE)
	ready = WAIT_FAILED;
      else
        {
          /* Wait for the current process to die, more efficient than SleepEx(). */
          WaitForSingleObjectEx (GetCurrentProcess (), timeout_ms, TRUE);
          ready = WAIT_TIMEOUT;
        }
    }
  else
    {
      /* Wait for just handles
       * -> Use WaitForMultipleObjectsEx
       */
#ifdef G_MAIN_POLL_DEBUG
      if (_g_main_poll_debug)
	g_print ("  WaitForMultipleObjectsEx(%d, %lu)\n", nhandles, timeout_ms);
#endif

      ready = WaitForMultipleObjectsEx (nhandles, handles, FALSE, timeout_ms, TRUE);
      if (ready == WAIT_FAILED)
	{
	  gchar *emsg = g_win32_error_message (GetLastError ());
	  g_warning ("WaitForMultipleObjectsEx failed: %s", emsg);
	  g_free (emsg);
	}
    }

#ifdef G_MAIN_POLL_DEBUG
  if (_g_main_poll_debug)
    g_print ("  wait returns %ld%s\n",
	     ready,
	     (ready == WAIT_FAILED ? " (WAIT_FAILED)" :
	      (ready == WAIT_TIMEOUT ? " (WAIT_TIMEOUT)" :
	       (msg_fd != NULL && ready == WAIT_OBJECT_0 + nhandles ? " (msg)" : ""))));
#endif

  if (ready == WAIT_FAILED)
    return -1;
  else if (ready == WAIT_TIMEOUT ||
	   ready == WAIT_IO_COMPLETION)
    return 0;
  else if (msg_fd != NULL && ready == WAIT_OBJECT_0 + nhandles)
    {
      msg_fd->revents |= G_IO_IN;

      /* If we have a timeout, or no handles to poll, be satisfied
       * with just noticing we have messages waiting.
       */
      if (timeout_ms != 0 || nhandles == 0)
	return 1;

      /* If no timeout and handles to poll, recurse to poll them,
       * too.
       */
      recursed_result = poll_rest (NULL, stop_fd, handles, handle_to_fd, nhandles, 0);
      return (recursed_result == -1) ? -1 : 1 + recursed_result;
    }
  else if (ready < WAIT_OBJECT_0 + nhandles)
    {
      int retval;

      f = handle_to_fd[ready - WAIT_OBJECT_0];
      f->revents = f->events;
#ifdef G_MAIN_POLL_DEBUG
      if (_g_main_poll_debug)
        g_print ("  got event %p\n", (HANDLE) f->fd);
#endif

      /* Do not count the stop_fd */
      retval = (f != stop_fd) ? 1 : 0;

      /* If no timeout and polling several handles, recurse to poll
       * the rest of them.
       */
      if (timeout_ms == 0 && nhandles > 1)
        {
          /* Poll the handles with index > ready */
          HANDLE *shorter_handles;
          GPollFD **shorter_handle_to_fd;
          gint shorter_nhandles;

          shorter_handles = &handles[ready - WAIT_OBJECT_0 + 1];
          shorter_handle_to_fd = &handle_to_fd[ready - WAIT_OBJECT_0 + 1];
          shorter_nhandles = nhandles - (ready - WAIT_OBJECT_0 + 1);

          recursed_result = poll_rest (NULL, stop_fd, shorter_handles, shorter_handle_to_fd, shorter_nhandles, 0);
          return (recursed_result == -1) ? -1 : retval + recursed_result;
        }
      return retval;
    }

  return 0;
}

typedef struct
{
  HANDLE handles[MAXIMUM_WAIT_OBJECTS];
  GPollFD *handle_to_fd[MAXIMUM_WAIT_OBJECTS];
  GPollFD *msg_fd;
  GPollFD *stop_fd;
  gint nhandles;
  DWORD    timeout_ms;
} GWin32PollThreadData;

static gint
poll_single_thread (GWin32PollThreadData *data)
{
  int retval;

  /* Polling for several things? */
  if (data->nhandles > 1 || (data->nhandles > 0 && data->msg_fd != NULL))
    {
      /* First check if one or several of them are immediately
       * available
       */
      retval = poll_rest (data->msg_fd, data->stop_fd, data->handles, data->handle_to_fd, data->nhandles, 0);

      /* If not, and we have a significant timeout, poll again with
       * timeout then. Note that this will return indication for only
       * one event, or only for messages.
       */
      if (retval == 0 && (data->timeout_ms == INFINITE || data->timeout_ms > 0))
        retval = poll_rest (data->msg_fd, data->stop_fd, data->handles, data->handle_to_fd, data->nhandles, data->timeout_ms);
    }
  else
    {
      /* Just polling for one thing, so no need to check first if
       * available immediately
       */
      retval = poll_rest (data->msg_fd, data->stop_fd, data->handles, data->handle_to_fd, data->nhandles, data->timeout_ms);
    }

  return retval;
}

static void
fill_poll_thread_data (GPollFD              *fds,
                       guint                 nfds,
                       DWORD                 timeout_ms,
                       GPollFD              *stop_fd,
                       GWin32PollThreadData *data)
{
  GPollFD *f;

  data->timeout_ms = timeout_ms;

  if (stop_fd != NULL)
    {
#ifdef G_MAIN_POLL_DEBUG
      if (_g_main_poll_debug)
        g_print (" Stop FD: %p", (HANDLE) stop_fd->fd);
#endif

      g_assert (data->nhandles < MAXIMUM_WAIT_OBJECTS);

      data->stop_fd = stop_fd;
      data->handle_to_fd[data->nhandles] = stop_fd;
      data->handles[data->nhandles++] = (HANDLE) stop_fd->fd;
    }

  for (f = fds; f < &fds[nfds]; ++f)
    {
      if ((data->nhandles == MAXIMUM_WAIT_OBJECTS) ||
          (data->msg_fd != NULL && (data->nhandles == MAXIMUM_WAIT_OBJECTS - 1)))
        {
          g_warning ("Too many handles to wait for!");
          break;
        }

      if (f->fd == G_WIN32_MSG_HANDLE && (f->events & G_IO_IN))
        {
#ifdef G_MAIN_POLL_DEBUG
          if (_g_main_poll_debug && data->msg_fd == NULL)
            g_print (" MSG");
#endif
          data->msg_fd = f;
        }
      else if (f->fd > 0)
        {
#ifdef G_MAIN_POLL_DEBUG
          if (_g_main_poll_debug)
            g_print (" %p", (HANDLE) f->fd);
#endif
          data->handle_to_fd[data->nhandles] = f;
          data->handles[data->nhandles++] = (HANDLE) f->fd;
        }

      f->revents = 0;
    }
}

static guint __stdcall
poll_thread_run (gpointer user_data)
{
  GWin32PollThreadData *data = user_data;

  /* Docs say that it is safer to call _endthreadex by our own:
   * https://docs.microsoft.com/en-us/cpp/c-runtime-library/reference/endthread-endthreadex
   */
  _endthreadex (poll_single_thread (data));

  g_assert_not_reached ();

  return 0;
}

/* One slot for a possible msg object or the stop event */
#define MAXIMUM_WAIT_OBJECTS_PER_THREAD (MAXIMUM_WAIT_OBJECTS - 1)

gint
g_poll (GPollFD *fds,
	guint    nfds,
	gint     timeout)
{
  guint nthreads, threads_remain;
  HANDLE thread_handles[MAXIMUM_WAIT_OBJECTS];
  GWin32PollThreadData *threads_data;
  GPollFD stop_event = { 0, };
  GPollFD *f;
  guint i, fds_idx = 0;
  DWORD ready;
  DWORD thread_retval;
  int retval;
  GPollFD *msg_fd = NULL;

  if (timeout == -1)
    timeout = INFINITE;

  /* Simple case without extra threads */
  if (nfds <= MAXIMUM_WAIT_OBJECTS)
    {
      GWin32PollThreadData data = { 0, };

#ifdef G_MAIN_POLL_DEBUG
      if (_g_main_poll_debug)
        g_print ("g_poll: waiting for");
#endif

      fill_poll_thread_data (fds, nfds, timeout, NULL, &data);

#ifdef G_MAIN_POLL_DEBUG
      if (_g_main_poll_debug)
        g_print ("\n");
#endif

      retval = poll_single_thread (&data);
      if (retval == -1)
        for (f = fds; f < &fds[nfds]; ++f)
          f->revents = 0;

      return retval;
    }

#ifdef G_MAIN_POLL_DEBUG
  if (_g_main_poll_debug)
    g_print ("g_poll: polling with threads\n");
#endif

  nthreads = nfds / MAXIMUM_WAIT_OBJECTS_PER_THREAD;
  threads_remain = nfds % MAXIMUM_WAIT_OBJECTS_PER_THREAD;
  if (threads_remain > 0)
    nthreads++;

  if (nthreads > MAXIMUM_WAIT_OBJECTS_PER_THREAD)
    {
      g_warning ("Too many handles to wait for in threads!");
      nthreads = MAXIMUM_WAIT_OBJECTS_PER_THREAD;
    }

#if GLIB_SIZEOF_VOID_P == 8
  stop_event.fd = (gint64)CreateEventW (NULL, TRUE, FALSE, NULL);
#else
  stop_event.fd = (gint)CreateEventW (NULL, TRUE, FALSE, NULL);
#endif
  stop_event.events = G_IO_IN;

  threads_data = g_new0 (GWin32PollThreadData, nthreads);
  for (i = 0; i < nthreads; i++)
    {
      guint thread_fds;
      guint ignore;

      if (i == (nthreads - 1) && threads_remain > 0)
        thread_fds = threads_remain;
      else
        thread_fds = MAXIMUM_WAIT_OBJECTS_PER_THREAD;

      fill_poll_thread_data (fds + fds_idx, thread_fds, timeout, &stop_event, &threads_data[i]);
      fds_idx += thread_fds;

      /* We must poll for messages from the same thread, so poll it along with the threads */
      if (threads_data[i].msg_fd != NULL)
        {
          msg_fd = threads_data[i].msg_fd;
          threads_data[i].msg_fd = NULL;
        }

      thread_handles[i] = (HANDLE) _beginthreadex (NULL, 0, poll_thread_run, &threads_data[i], 0, &ignore);
    }

  /* Wait for at least one thread to return */
  if (msg_fd != NULL)
    ready = MsgWaitForMultipleObjectsEx (nthreads, thread_handles, timeout,
                                         QS_ALLINPUT, MWMO_ALERTABLE);
  else
    ready = WaitForMultipleObjects (nthreads, thread_handles, FALSE, timeout);

  /* Signal the stop in case any of the threads did not stop yet */
  if (!SetEvent ((HANDLE)stop_event.fd))
    {
      gchar *emsg = g_win32_error_message (GetLastError ());
      g_warning ("gpoll: failed to signal the stop event: %s", emsg);
      g_free (emsg);
    }

  /* Wait for the rest of the threads to finish */
  WaitForMultipleObjects (nthreads, thread_handles, TRUE, INFINITE);

  /* The return value of all the threads give us all the fds that changed state */
  retval = 0;
  if (msg_fd != NULL && ready == WAIT_OBJECT_0 + nthreads)
    {
      msg_fd->revents |= G_IO_IN;
      retval = 1;
    }

  for (i = 0; i < nthreads; i++)
    {
      if (GetExitCodeThread (thread_handles[i], &thread_retval))
        retval = (retval == -1) ? -1 : ((thread_retval == (DWORD) -1) ? -1 : (int) (retval + thread_retval));

      CloseHandle (thread_handles[i]);
    }

  if (retval == -1)
    for (f = fds; f < &fds[nfds]; ++f)
      f->revents = 0;

  g_free (threads_data);
  CloseHandle ((HANDLE)stop_event.fd);

  return retval;
}

#elif defined (HAVE_KQUEUE)

gint
g_poll (GPollFD *fds,
	guint    nfds,
	gint     timeout)
{
  int ret, errsv, kq, i;
  guint max_events;
  struct kevent *events, *ev;
  guint num_wakeup_fds;
  struct timespec *ts, ts_storage;

  kq = kqueue ();
  if (kq == -1)
    return -1;

  max_events = nfds * 3;
  events = g_newa (struct kevent, max_events);
  ev = events;
  num_wakeup_fds = 0;

  for (i = 0; i < (int) nfds; i++)
    {
      GPollFD *fd = &fds[i];

      if (fd->fd == G_KQUEUE_WAKEUP_HANDLE)
	{
	  EV_SET (ev, GPOINTER_TO_SIZE (fd->handle), EVFILT_USER, EV_ADD,
		  NOTE_FFCOPY, 0, NULL);
	  ev++;
	  num_wakeup_fds++;
	}
      else if (fd->fd >= 0)
	{
	  if (fd->events & G_IO_IN)
	    {
	      EV_SET (ev, fd->fd, EVFILT_READ, EV_ADD, 0, 0, fd);
	      ev++;
	    }
	  if (fd->events & G_IO_OUT)
	    {
	      EV_SET (ev, fd->fd, EVFILT_WRITE, EV_ADD, 0, 0, fd);
	      ev++;
	    }
#ifdef EVFILT_EXCEPT
	  if (fd->events & G_IO_PRI)
	    {
	      EV_SET (ev, fd->fd, EVFILT_EXCEPT, EV_ADD, NOTE_OOB, 0, fd);
	      ev++;
	    }
#endif
	}
    }

  if (timeout >= 0)
    {
      ts_storage.tv_sec = timeout / 1000;
      ts_storage.tv_nsec = (timeout % 1000) * 1000000;
      ts = &ts_storage;
    }
  else
    {
      ts = NULL;
    }

  if (num_wakeup_fds == 0)
    {
      ret = kevent (kq, events, ev - events, events, max_events, ts);
      errsv = errno;
    }
  else
    {
      ret = kevent (kq, events, ev - events, NULL, 0, NULL);
      errsv = errno;
      if (ret == -1)
	goto beach;

      for (i = 0; i < (int) nfds; i++)
	{
	  GPollFD *fd = &fds[i];

	  if (fd->fd == G_KQUEUE_WAKEUP_HANDLE)
	    _g_wakeup_kqueue_realize (fd->handle, kq);
	}

      ret = kevent (kq, NULL, 0, events, max_events, ts);
      errsv = errno;
    }

  for (i = 0; i < (int) nfds; i++)
    fds[i].revents = 0;

  for (i = 0; i < ret; i++)
    {
      struct kevent *ev = &events[i];
      GPollFD *pfd = ev->udata;

      switch (ev->filter)
	{
	  case EVFILT_READ:
	    if (pfd->events & G_IO_IN)
	      pfd->revents |= G_IO_IN;
#ifdef EV_OOBAND
	    if (pfd->events & G_IO_PRI && ev->flags & EV_OOBAND)
	      pfd->revents |= G_IO_PRI;
#endif
	    if (ev->flags & EV_EOF)
	      {
		pfd->revents |= G_IO_HUP;
		if (ev->fflags != 0)
		  pfd->revents |= G_IO_ERR;
	      }
	    if (ev->flags & EV_ERROR)
	      pfd->revents |= G_IO_ERR;
	    break;
	  case EVFILT_WRITE:
	    if (pfd->events & G_IO_OUT)
	      pfd->revents |= G_IO_OUT;
	    if (ev->flags & (EV_EOF|EV_ERROR))
	      pfd->revents |= G_IO_ERR;
	    break;
#ifdef EVFILT_EXCEPT
	  case EVFILT_EXCEPT:
	    if (pfd->events & G_IO_PRI)
	      pfd->revents |= G_IO_PRI;
	    if (ev->flags & EV_EOF)
	      pfd->revents |= G_IO_HUP;
	    if (ev->flags & EV_ERROR)
	      pfd->revents |= G_IO_ERR;
	    break;
#endif
	  case EVFILT_USER:
	    for (int j = 0; j < (int) nfds; j++)
		{
		  pfd = &fds[j];
		  if (pfd->fd == G_KQUEUE_WAKEUP_HANDLE &&
		      pfd->handle == GSIZE_TO_POINTER (ev->ident))
		    {
		      if (pfd->events & G_IO_IN)
			pfd->revents |= G_IO_IN;
		    }
		}
	    break;
	}
    }

  if (ret > 0)
    {
      ret = 0;
      for (i = 0; i < (int) nfds; i++)
	{
	  if (fds[i].revents != 0)
	    ret++;
	}
    }
  else if (ret < 0 && errsv != EINTR)
    {
      g_warning ("kevent(2) failed due to: %s.",
		 g_strerror (errsv));
    }

beach:
  if (num_wakeup_fds > 0)
    {
      for (i = 0; i < (int) nfds; i++)
	{
	  GPollFD *fd = &fds[i];

	  if (fd->fd == G_KQUEUE_WAKEUP_HANDLE)
	    _g_wakeup_kqueue_unrealize (fd->handle);
	}
    }

  close (kq);

  if (ret == -1)
    errno = errsv;

  return ret;
}

#elif defined (G_OS_NONE)

typedef struct _GPollOperation GPollOperation;

struct _GPollOperation
{
  GPollFD *fds;
  guint    nfds;
};

gint
g_poll (GPollFD *fds,
	guint    nfds,
	gint     timeout)
{
  gint ready;
  gint64 deadline;
  guint i;
  GPollOperation op = { fds, nfds };
  gpointer token = &op;
  gboolean slept;

  deadline = (timeout == -1)
      ? G_MAXINT64
      : g_get_monotonic_time () + (timeout * G_TIME_SPAN_MILLISECOND);

  for (i = 0; i < nfds; i++)
    {
      GPollFD *p = &fds[i];

      if (p->fd == G_WAIT_WAKEUP_HANDLE)
        {
          GWakeup *w = p->user_data;

          g_atomic_pointer_set (&w->token, token);
        }
    }

  slept = FALSE;

  for (;;)
    {
      gint64 timeout_us;

      ready = 0;

      for (i = 0; i < nfds; i++)
        {
          GPollFD *p = &fds[i];

          p->revents = 0;

          if (p->fd == G_WAIT_WAKEUP_HANDLE)
            {
              GWakeup *w = p->user_data;

              if (g_atomic_int_get (&w->signalled))
                {
                  p->revents = G_IO_IN;
                  ready++;
                }
            }
        }

      if (ready || timeout == 0 || slept)
        goto done;

      if (timeout == -1)
        {
          timeout_us = G_WAIT_INFINITE;
        }
      else
        {
          gint64 now;

          now = g_get_monotonic_time ();
          if (now >= deadline)
            goto done;

          timeout_us = deadline - now;
        }

      g_wait_sleep (token, timeout_us);

      slept = TRUE;
    }

done:
  for (i = 0; i < nfds; i++)
    {
      GPollFD *p = &fds[i];

      if (p->fd == G_WAIT_WAKEUP_HANDLE)
        {
          GWakeup *w = p->user_data;

          g_atomic_pointer_set (&w->token, NULL);
        }
    }

  return ready;
}

/**
 * g_wait_sleep:
 *
 * Blocks the **current** thread until either
 *   • @timeout_us expires,           or
 *   • g_wait_wake (@token) fires on the *same* token.
 *
 * @token is opaque; the implementation must **not** dereference it.
 *
 * GLib ships weak, do-nothing fall-backs so normal builds link without
 * an extra object file.  Kernels, bare-metal firmware, RTOSes, etc.
 * simply override both symbols.
 */
G_GNUC_WEAK void
g_wait_sleep (gpointer token, gint64 timeout_us)
{
#ifdef G_OS_NONE
  G_PANIC_MISSING_IMPLEMENTATION ();
#endif
}

/**
 * g_wait_wake:
 *
 * Unblocks every thread that is currently sleeping on the same token.
 */
G_GNUC_WEAK void
g_wait_wake (gpointer token)
{
#ifdef G_OS_NONE
  G_PANIC_MISSING_IMPLEMENTATION ();
#endif
}

/**
 * g_wait_is_set:
 *
 * For g_wait_sleep() to query whether g_wait_wake() may already have been
 * called, to avoid deadlocking in case it needs to register the token before
 * it can be used to wake it up.
 */
gboolean
g_wait_is_set (gpointer token)
{
  GPollOperation *op = token;
  guint i;

  for (i = 0; i < op->nfds; i++)
    {
      GPollFD *p = &op->fds[i];

      if (p->fd == G_WAIT_WAKEUP_HANDLE)
        {
          GWakeup *w = p->user_data;
          if (g_atomic_int_get (&w->signalled))
            return TRUE;
        }
    }

  return FALSE;
}

#else  /* !G_OS_WIN32 */

/* The following implementation of poll() comes from the GNU C Library.
 * Copyright (C) 1994, 1996, 1997 Free Software Foundation, Inc.
 */

#include <string.h> /* for bzero on BSD systems */

#ifdef HAVE_SYS_SELECT_H
#include <sys/select.h>
#endif /* HAVE_SYS_SELECT_H */

gint
g_poll (GPollFD *fds,
	guint    nfds,
	gint     timeout)
{
  struct timeval tv;
  fd_set rset, wset, xset;
  GPollFD *f;
  int ready;
  int maxfd = 0;

  FD_ZERO (&rset);
  FD_ZERO (&wset);
  FD_ZERO (&xset);

  for (f = fds; f < &fds[nfds]; ++f)
    if (f->fd >= 0)
      {
	if (f->events & G_IO_IN)
	  FD_SET (f->fd, &rset);
	if (f->events & G_IO_OUT)
	  FD_SET (f->fd, &wset);
	if (f->events & G_IO_PRI)
	  FD_SET (f->fd, &xset);
	if (f->fd > maxfd && (f->events & (G_IO_IN|G_IO_OUT|G_IO_PRI)))
	  maxfd = f->fd;
      }

  tv.tv_sec = timeout / 1000;
  tv.tv_usec = (timeout % 1000) * 1000;

  ready = select (maxfd + 1, &rset, &wset, &xset,
		  timeout == -1 ? NULL : &tv);
  if (ready > 0)
    for (f = fds; f < &fds[nfds]; ++f)
      {
	f->revents = 0;
	if (f->fd >= 0)
	  {
	    if (FD_ISSET (f->fd, &rset))
	      f->revents |= G_IO_IN;
	    if (FD_ISSET (f->fd, &wset))
	      f->revents |= G_IO_OUT;
	    if (FD_ISSET (f->fd, &xset))
	      f->revents |= G_IO_PRI;
	  }
      }

  return ready;
}

#endif /* !G_OS_WIN32 */

#endif	/* !HAVE_POLL */
