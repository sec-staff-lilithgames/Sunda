<<<<<<< HEAD
# GLib

GLib is the low-level core library that forms the basis for projects such
as GTK and GNOME. It provides data structure handling for C, portability
wrappers, and interfaces for such runtime functionality as an event loop,
threads, dynamic loading, and an object system.

The Frida GLib location is:
  <https://github.com/frida/glib>

The official GLib locations are:
  <https://download.gnome.org/sources/glib>
  <https://gitlab.gnome.org/GNOME/glib/>

The official web site is:
  <https://www.gtk.org/>

## Installation

See the file '[INSTALL.md](INSTALL.md)'

## Supported versions

Only the most recent unstable and stable release series are supported. All
older versions are not supported upstream and may contain bugs, some of
which may be exploitable security vulnerabilities.

See [SECURITY.md](SECURITY.md) for more details.

## Documentation

API documentation is available online for GLib for the:
 * [GLib](https://docs.gtk.org/glib/)
 * [GObject](https://docs.gtk.org/gobject/)
 * [GModule](https://docs.gtk.org/gmodule/)
 * [GIO](https://docs.gtk.org/gio/)

## Discussion

If you have a question about how to use GLib, seek help on [GNOME’s Discourse
instance](https://discourse.gnome.org/tags/glib). Alternatively, ask a question
on [StackOverflow and tag it `glib`](https://stackoverflow.com/questions/tagged/glib).

## Reporting bugs

Bugs should be [reported to the GNOME issue tracking system](https://gitlab.gnome.org/GNOME/glib/issues/new).
You will need to create an account for yourself. You may also submit bugs by
e-mail (without an account) by e-mailing <incoming+gnome-glib-658-issue-@gitlab.gnome.org>,
but this will give you a degraded experience.

Bugs are for reporting problems in GLib itself, not for asking questions about
how to use it. To ask questions, use one of our [discussion forums](#discussion).

In bug reports please include:

* Information about your system. For instance:
  * What operating system and version
  * For Linux, what version of the C library
  * And anything else you think is relevant.
* How to reproduce the bug.
  * If you can reproduce it with one of the test programs that are built
  in the `tests/` subdirectory, that will be most convenient.  Otherwise,
  please include a short test program that exhibits the behavior.
  As a last resort, you can also provide a pointer to a larger piece
  of software that can be downloaded.
* If the bug was a crash, the exact text that was printed out
  when the crash occurred.
* Further information such as stack traces may be useful, but
  is not necessary.

## Contributing to GLib

Please follow the [contribution guide](./CONTRIBUTING.md) to know how to
start contributing to GLib.

Patches should be [submitted as merge requests](https://gitlab.gnome.org/GNOME/glib/-/merge_requests/new)
to gitlab.gnome.org. If the patch fixes an existing issue, please refer to the
issue in your commit message with the following notation (for issue 123):
```
Closes: #123
```

Otherwise, create a new merge request that introduces the change. Filing a
separate issue is not required.

## Default branch renamed to `main`

The default development branch of GLib has been renamed to `main`. To update
your local checkout, use:
```sh
git checkout master
git branch -m master main
git fetch
git branch --unset-upstream
git branch -u origin/main
git symbolic-ref refs/remotes/origin/HEAD refs/remotes/origin/main
```
=======
<<<<<<< HEAD
# Frida

Dynamic instrumentation toolkit for developers, reverse-engineers, and security
researchers. Learn more at [frida.re](https://frida.re/).

Two ways to install
===================

## 1. Install from prebuilt binaries

This is the recommended way to get started. All you need to do is:

    pip install frida-tools # CLI tools
    pip install frida       # Python bindings
    npm install frida       # Node.js bindings

You may also download pre-built binaries for various operating systems from
Frida's [releases](https://github.com/frida/frida/releases) page on GitHub.

## 2. Build your own binaries

Run:

    make

You may also invoke `./configure` first if you want to specify a `--prefix`, or
any other options.

### CLI tools

For running the Frida CLI tools, e.g. `frida`, `frida-ls-devices`, `frida-ps`,
`frida-kill`, `frida-trace`, `frida-discover`, etc., you need a few packages:

    pip install colorama prompt-toolkit pygments

### Apple OSes

First make a trusted code-signing certificate. You can use the guide at
https://sourceware.org/gdb/wiki/PermissionsDarwin in the sections
“Create a certificate in the System Keychain” and “Trust the certificate
for code signing”. You can use the name `frida-cert` instead of `gdb-cert`
if you'd like.

Next export the name of the created certificate to relevant environment
variables, and run `make`:

    export MACOS_CERTID=frida-cert
    export IOS_CERTID=frida-cert
    export WATCHOS_CERTID=frida-cert
    export TVOS_CERTID=frida-cert
    make

To ensure that macOS accepts the newly created certificate, restart the
`taskgated` daemon:

    sudo killall taskgated

## Learn more

Have a look at our [documentation](https://frida.re/docs/home/).
=======
# Sunda---the-brother-of-Frida
A fork of frida 17.4.1
>>>>>>> 820866fda075c9611dac330c9bbc66ba2f5c3efd
>>>>>>> 4a7254c503971088297a01c775e4810597e83d74
