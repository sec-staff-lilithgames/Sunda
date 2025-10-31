/*
 * Copyright © 2011 Canonical Limited
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 *
 * Author: Ryan Lortie <desrt@desrt.ca>
 */

#ifndef __GLIB_INIT_H__
#define __GLIB_INIT_H__

#include "gmessages.h"

typedef void (* GXtorFunc) (void);

extern GLogLevelFlags g_log_always_fatal;
extern GLogLevelFlags g_log_msg_prefix;

void g_quark_init (void);

#ifdef G_OS_WIN32
#include <windows.h>

G_GNUC_INTERNAL void _g_thread_win32_process_detach (void);
G_GNUC_INTERNAL void _g_thread_win32_thread_detach (void);
G_GNUC_INTERNAL void _g_console_win32_init (void);
G_GNUC_INTERNAL void _g_clock_win32_init (void);
G_GNUC_INTERNAL void _g_crash_handler_win32_init (void);
G_GNUC_INTERNAL void _g_crash_handler_win32_deinit (void);
gboolean _g_win32_call_rtl_version (OSVERSIONINFOEXW *info);

extern HMODULE glib_dll;
gchar *g_win32_find_helper_executable_path (const gchar *process_name, void *dll_handle);
int g_win32_reopen_noninherited (int fd, int mode, GError **err);
gboolean g_win32_handle_is_socket (void *h);

#endif

G_GNUC_INTERNAL void _g_slice_deinit (void);
G_GNUC_INTERNAL void _g_thread_init (void);
G_GNUC_INTERNAL void _g_thread_deinit (void);
G_GNUC_INTERNAL void _g_thread_pool_shutdown (void);
G_GNUC_INTERNAL void _g_strfuncs_deinit (void);
G_GNUC_INTERNAL void _g_main_shutdown (void);
G_GNUC_INTERNAL void _g_main_deinit (void);
G_GNUC_INTERNAL void _g_messages_deinit (void);

_GLIB_EXTERN void _glib_register_constructor (GXtorFunc constructor);
_GLIB_EXTERN void _glib_register_destructor (GXtorFunc destructor);

#endif /* __GLIB_INIT_H__ */
