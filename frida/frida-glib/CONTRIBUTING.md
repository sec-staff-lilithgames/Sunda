<<<<<<< HEAD
# Contribution guidelines

Thank you for considering contributing to the GLib project!

These guidelines are meant for new contributors, regardless of their level
of proficiency; following them allows the core developers of the GLib project to
more effectively evaluate your contribution, and provide prompt feedback to
you. Additionally, by following these guidelines you clearly communicate
that you respect the time and effort that the people developing GLib put into
managing the project.

GLib is a complex free software utility library, and it would not exist without
contributions from the free and open source software community. There are
many things that we value:

 - bug reporting and fixing
 - documentation and examples
 - tests
 - testing and support for other platforms
 - new features

Please, do not use the issue tracker for support questions. If you have
questions on how to use GLib effectively, you can use:

 - the `#gtk` IRC channel on irc.gnome.org
 - the [`glib` tag on GNOME's Discourse](https://discourse.gnome.org/tags/glib)

You can also look at the [`glib` tag on Stack
Overflow](https://stackoverflow.com/questions/tagged/glib).

The issue tracker is meant to be used for actionable issues only.

## How to report bugs

### Security issues

You should not open a new issue for security related questions.

When in doubt, send an email to the [security](mailto:security@gnome.org)
mailing list.

### Bug reports

If you’re reporting a bug make sure to list:

 0. which version of GLib are you using?
 0. which operating system are you using?
 0. the necessary steps to reproduce the issue
 0. the expected outcome
 0. a description of the behavior
 0. a small, self-contained example exhibiting the behavior

If the issue includes a crash, you should also include:

 0. the eventual warnings printed on the terminal
 0. a backtrace, obtained with tools such as GDB or LLDB

If the issue includes a memory leak, you should also include:

 0. a log of definite leaks from a tool such as [valgrind’s
    memcheck](http://valgrind.org/docs/manual/mc-manual.html)

For small issues, such as:

 - spelling/grammar fixes in the documentation,
 - typo correction,
 - comment clean ups,
 - changes to metadata files (CI, `.gitignore`),
 - build system changes, or
 - source tree clean ups and reorganizations;

or for self-contained bug fixes where you have implemented and tested a solution
already, you should directly open a merge request instead of filing a new issue.

### Features and enhancements

Feature discussion can be open ended and require high bandwidth channels; if
you are proposing a new feature on the issue tracker, make sure to make
an actionable proposal, and list:

 0. what you’re trying to achieve and the problem it solves
 0. three (or more) existing pieces of software which would benefit from the
    new feature
 0. how the feature is implementable on platforms other than Linux

New APIs, in particular, should follow the ‘rule of three’, where there should
be three (or more) pieces of software which are ready to use the new APIs. This
allows us to check that the new APIs are usable in real-life code, and fit well
with related APIs. This reduces the chances of awkward or unusable APIs becoming
stable in GLib and having to be supported forever.

A common way to introduce new APIs or data types to GLib is to prototype them in
another code base for a while, to gain real-life experience with them before
they are imported into GLib and marked as stable.

Each feature should also come fully documented, and with tests which approach
full branch coverage of the new code. GLib’s CI system generates code coverage
reports which are viewable for each merge request. See
[the testing policy](./docs/testing.md) for more details.

If proposing a large feature or change, it’s better to discuss it (on the
`#gtk` IRC channel or on [Discourse](https://discourse.gnome.org) before
putting time into writing an actionable issue — and certainly before putting
time into writing a merge request.

## Your first contribution

### Prerequisites

If you want to contribute to the GLib project, you will need to have the
development tools appropriate for your operating system, including:

 - Python 3.x
 - Meson
 - Ninja
 - Gettext (19.7 or newer)
 - a [C99 compatible compiler](https://wiki.gnome.org/Projects/GLib/CompilerRequirements)

Up-to-date instructions about developing GNOME applications and libraries
can be found on [the GNOME Developer Center](https://developer.gnome.org).

The [GLib project uses GitLab](https://gitlab.gnome.org/GNOME/glib/) for code
hosting and for tracking issues. More information about using GitLab can be
found [on the GNOME wiki](https://wiki.gnome.org/GitLab).

### Getting started

You should start by forking the GLib repository from the GitLab web UI, and
cloning from your fork:

```sh
$ git clone https://gitlab.gnome.org/yourusername/glib.git
$ cd glib
```

**Note**: if you plan to push changes to back to the main repository and
have a GNOME account, you can skip the fork, and use the following instead:

```sh
$ git clone git@gitlab.gnome.org:GNOME/glib.git
$ cd glib
```

To compile the Git version of GLib on your system, you will need to
configure your build using Meson:

```sh
$ meson _builddir .
$ cd _builddir
$ ninja
```

Typically, you should work on your own branch:

```sh
$ git checkout -b your-branch
```

Once you’ve finished working on the bug fix or feature, push the branch
to the Git repository and open a new merge request, to let the GLib
core developers review your contribution.

### Code reviews

Each contribution is reviewed by the core developers of the GLib project.

The [CODEOWNERS](./docs/CODEOWNERS) document contains the list of core
contributors to GLib and the areas for which they are responsible; you
should ensure to receive their review and signoff on your changes.

It is our intention that every commit to GLib is reviewed by at least one other
person, including commits from core developers. We all make mistakes and can
always learn from each other, and code review allows that. It also reduces
[bus factor](https://en.wikipedia.org/wiki/Bus_factor) by spreading knowledge
of each commit between at least two people.

With each code review, we intend to:

 0. Identify if this is a desirable change or new feature. Ideally for larger
    features this will have been discussed (in an issue, on IRC, or on Discourse)
    already, so that effort isn’t wasted on putting together merge requests
    which will be rejected.
 0. Check the design of any new API.
 0. Provide realistic estimates of how long a review might take, if it can’t
    happen immediately.
 0. Ensure that all significant contributions of new code, or bug fixes, are
    adequately tested, either through requiring tests to be submitted at the
    same time, or as a follow-up.
 0. Ensure that all new APIs are documented and have [introspection
    annotations](https://wiki.gnome.org/Projects/GObjectIntrospection/Annotations).
 0. Check that the contribution is split into logically separate commits, each
    with a good commit message.
 0. Encourage further high quality contributions.
 0. Ensure code style and quality is upheld.

If a code review is stalled (due to not receiving comments for two or more
weeks; or due to a technical disagreement), please ping another GLib core
developer on the merge request, or on IRC, to ask for a second opinion.

### Commit messages

The expected format for git commit messages is as follows:

```plain
Short explanation of the commit

Longer explanation explaining exactly what’s changed, whether any
external or private interfaces changed, what bugs were fixed (with bug
tracker reference if applicable) and so forth. Be concise but not too
brief.

Closes #1234
```

 - Always add a brief description of the commit to the _first_ line of
 the commit and terminate by two newlines (it will work without the
 second newline, but that is not nice for the interfaces).

 - First line (the brief description) must only be one sentence and
 should start with a capital letter unless it starts with a lowercase
 symbol or identifier. Don’t use a trailing period either. Don’t exceed
 72 characters.

 - The main description (the body) is normal prose and should use normal
 punctuation and capital letters where appropriate. Consider the commit
 message as an email sent to the developers (or yourself, six months
 down the line) detailing **why** you changed something. There’s no need
 to specify the **how**: the changes can be inlined.

 - When committing code on behalf of others use the `--author` option, e.g.
 `git commit -a --author "Joe Coder <joe@coder.org>"` and `--signoff`.

 - If your commit is addressing an issue, use the
 [GitLab syntax](https://docs.gitlab.com/ce/user/project/issues/automatic_issue_closing.html)
 to automatically close the issue when merging the commit with the upstream
 repository:

```plain
Closes #1234
Fixes #1234
Closes: https://gitlab.gnome.org/GNOME/glib/issues/1234
```

 - If you have a merge request with multiple commits and none of them
 completely fixes an issue, you should add a reference to the issue in
 the commit message, e.g. `Bug: #1234`, and use the automatic issue
 closing syntax in the description of the merge request.

### Merge access to the GLib repository

GLib is part of the GNOME infrastructure. At the current time, any
person with write access to the GNOME repository can merge merge requests to
GLib. This is a good thing, in that it allows maintainership to be delegated
and shared as needed. However, GLib is a fairly large and complicated package
that many other things depend on, and which has platform specific behavior — so
to avoid unnecessary breakage, and to take advantage of the knowledge about GLib
that has been built up over the years, we’d like to ask people contributing to
GLib to follow a few rules:

0. Never push to the `main` branch, or any stable branches, directly; you
   should always go through a merge request, to ensure that the code is
   tested on the CI infrastructure at the very least. A merge request is
   also the proper place to get a comprehensive code review from the core
   developers of GLib.

0. Always get a code review, even for seemingly trivial changes.

0. Pay attention to the CI results. Merge requests cannot be merged until the
   CI passes. If they consistently fail, either something is wrong with the
   change, or the CI tests need fixing — in either case, please bring this to
   the attention of a core developer rather than overriding the CI.

If you have been contributing to GLib for a while and you don’t have commit
access to the repository, you may ask to obtain it following the [GNOME account
process](https://wiki.gnome.org/AccountsTeam/NewAccounts).
=======
# Intro

Frida is composed of many sub-projects and its code spans across many
different languages, such as C, C++, Vala, JavaScript, TypeScript,
Python, assembly, etc., and the coding conventions may vary across any
combination of project/language.

The rules presented here are not there because of @oleavr's OCD: they're
about keeping the codebase readable and maintainable, and give the code
a consistent structure as it grows. That helps every contributor to
easily orientate in it.

Moreover, reading this doc helps save everyone's time when it comes to
get a PR reviewed.

# General rules

Rules in this section apply in all cases, regardless of the programming
language or the project owning the code. Examples are in
pseudo-javascript for brevity (with some exceptions).

## Comments vs. naming

### Rule

Only use comments for communicating what cannot be conveyed by the code
itself through meaningful variable and function names, and splitting out
logic into separate functions.

**NOTE**: names should be long enough to be meaningful, but not 
ridiculously long.

#### Wrong

```c
// Init the dyld start address with current program counter
a = (instance->cpu_type == GUM_CPU_ARM64) ? __darwin_arm_thread_state64_get_pc (state.ts_64) : state.ts_32.__pc;
// dyld header is initially zero
b = 0;
// set the search granularity to 4k
c = 4096;

for (dyld_chunk = (a & (c - 1)) == 0 ? (a - c) : (a & ~(c - 1));
    b == 0;
    dyld_chunk -= c)
{
	...
}
```

#### Correct

```c
dyld_start = (instance->cpu_type == GUM_CPU_ARM64) ? __darwin_arm_thread_state64_get_pc (state.ts_64) : state.ts_32.__pc;
dyld_header = 0;
dyld_granularity = 4096;

for (dyld_chunk = (dyld_start & (dyld_granularity - 1)) == 0 ? (dyld_start - dyld_granularity) : (dyld_start & ~(dyld_granularity - 1));
    dyld_header == 0;
    dyld_chunk -= dyld_granularity)
{
	...
}
```

#### Example

Here's a **really useful** comment.

```vala
/* Compiled from helpers/upload-listener.c */
private const uint8[] UPLOAD_LISTENER_CODE = {
	0xff, 0x43, 0x01, 0xd1, 0xf6, 0x57, 0x02, 0xa9, 0xf4, 0x4f, 0x03, 0xa9, 0xfd, 0x7b, 0x04, 0xa9, 0xfd, 0x03, 0x01,
	0x91, 0xf3, 0x03, 0x01, 0xaa, 0xe0, 0x1f, 0x00, 0xb9, 0x28, 0x00, 0x40, 0xf9, 0xe0, 0x03, 0x1f, 0x32, 0xe1, 0x03,
	0x00, 0x32, 0x02, 0x00, 0x80, 0x52, 0x00, 0x01, 0x3f, 0xd6, 0x1f, 0x04, 0x00, 0x31, 0x80, 0x05, 0x00, 0x54, 0xf4,
	...
	0xb2, 0x04, 0x00, 0x00, 0x14, 0xf5, 0x03, 0x46, 0xb2, 0x02, 0x00, 0x00, 0x14, 0x15, 0xa0, 0xe0, 0xd2, 0x68, 0x2a,
	0x40, 0xf9, 0xe0, 0x03, 0x14, 0xaa, 0x00, 0x01, 0x3f, 0xd6, 0xe0, 0x03, 0x15, 0xaa, 0xfd, 0x7b, 0x44, 0xa9, 0xf4,
	0x4f, 0x43, 0xa9, 0xf6, 0x57, 0x42, 0xa9, 0xff, 0x43, 0x01, 0x91, 0xc0, 0x03, 0x5f, 0xd6
};
```

### Rule

The variable name shouldn't be more verbose than its type name.

#### Wrong

```vala
private void schedule_idle (owned ScheduledFunc function) { ... }
```

#### Correct

```vala
private void schedule_idle (owned ScheduledFunc func) { ... }
```

## Order of functions in a file

### Rule 

Higher level functions must be placed before lower level functions, and
Should be sorted chronologically.
In case of C code the corresponding forward declarations must follow
the same order.

#### Wrong

```javascript
function getInfoAboutA() {
    /* complex code */
    return allInfoAboutA;
}

function getInfoAboutB() {
    /* more complex code */
    return allInfoAboutB;
}

function getInfo() {
    return {
        infoAboutA: getInfoAboutA(),
        infoAboutB: getInfoAboutB()
    };
}
```

#### Correct

```javascript
function getInfo() {
    return {
        infoAboutA: getInfoAboutA(),
        infoAboutB: getInfoAboutB()
    };
}

function getInfoAboutA() {
    /* complex code */
    return allInfoAboutA;
}

function getInfoAboutB() {
    /* more complex code */
    return allInfoAboutB;
}
```

### Rule

For exported functions / public methods: 
functions that work in all cases come before functions which work 
only under certain conditions.

#### Wrong

```javascript
function getPrivilegedInfo() {
    if (!amIRoot()) {
        throw new Error("You must be root");
    }
    ...
    return privilegedInfo;
}

function getHarmlessInfo() {
    return harmlessInfo;
}
```

#### Correct

```javascript
function getHarmlessInfo() {
    return harmlessInfo;
}

function getPrivilegedInfo() {
    if (!amIRoot()) {
        throw new Error("You must be root");
    }
    ...
    return privilegedInfo;
}
```

## Don't repeat yourself

### Rule

Instead of repeating chunks of code, extract it to a function and 
call it multiple times.

#### Example

There's no fixed recipe to define what a "repeated chunk of code is", it
really depends on the context. For example, even a couple of lines may
be worth refactoring into a function, especially if they require some
fairly complex error-handling logic.

```vala
private async LLDB.Client start_lldb_service (Fruity.LockdownClient lockdown, Cancellable? cancellable)
		throws Error, LLDB.Error, IOError {
	try {
		var lldb_stream = yield lockdown.start_service (DEBUGSERVER_SERVICE_NAME + "?tls=handshake-only", cancellable);
		return yield LLDB.Client.open (lldb_stream, cancellable);
	} catch (Fruity.LockdownError e) {
		if (e is Fruity.LockdownError.INVALID_SERVICE) {
			throw new Error.NOT_SUPPORTED ("This feature requires an iOS Developer Disk Image to be mounted; " +
				"run Xcode briefly or use ideviceimagemounter to mount one manually");
		}
		throw new Error.NOT_SUPPORTED ("%s", e.message);
	}
}
```

## Indentation

### Rule

Minimize nesting when possible.

#### Wrong

```javascript
function doSomethingMaybe() {
    if (condition) {
        /* do something here */
    }
}
```

#### Correct

```javascript
function doSomethingMaybe() {
    if (!condition) {
        return;
    }
    /* do something here */
}
```

### Rule

Hanging indent – when breaking a long line of code – should be *twice*
the regular indent, regardless of the indentation rules.

#### Wrong

```c
recursive_init_address = gum_darwin_module_resolve_symbol_address (dyld,
  "__ZN11ImageLoader23recursiveInitializationERKNS_11LinkContextEjRNS_21InitializerTimingListERNS_15UninitedUpwardsE");
```

#### Correct

```c
recursive_init_address = gum_darwin_module_resolve_symbol_address (dyld,
    "__ZN11ImageLoader23recursiveInitializationERKNS_11LinkContextEjRNS_21InitializerTimingListERNS_15UninitedUpwardsE");
```

## Spaces

### Rule

No trailing spaces.

## Indexed loops

### Rule

Prefer strict inequality for loop conditions.

#### Wrong

```javascript
for (let i = 0; i < len; i++) {
  ...
}
```

#### Correct

```javascript
for (let i = 0; i !== len; i++) {
  ...
}
```

## Comparisons

### Rule

Use explicit comparisons, even with `0`, `NULL`, and `undefined`,
instead of relying on language-specific coercion. Only use implicit
for booleans.

#### Wrong

```javascript
if (value) {
  ...
}
```

#### Correct

```javascript
if (value !== 0) {
  ...
}
```

## Argument validation

### Rule

Internal APIs should assume the API contract is not violated – i.e.
that the function is passed everything it needs – and omit any check
on the arguments.

#### Wrong

```javascript
function doSomethingInternallyWithDevice(device) {
  if (device === null || device === undefined) {
     throw new Error('Pass a valid device');
  }
  
  /* do the thing with device */
}
```

#### Correct

```javascript
function doSomethingInternallyWithDevice(device) {
  /* do the thing with device */
}
```

# Rules for C

This set of rules applies to C code, regardless of the project owning it.

## File structure

### Rule

Every C file must follow the following structure, in this order:

* Own header includes
* Internal header includes
* System/dependency includes
* typedefs
* enum and struct definitions
* Forward declarations / prototypes
* Global state / static variables
* Implementation code

Each such group should be separated by a blank line, and includes should
be listed in alphabetical order.

## Spaces

### Rule

In function calls and function definitions, put a space before
the parenthesis.

#### Wrong

```c
ret = thread_create(task, &instance->thread);
```

#### Correct

```c
ret = thread_create (task, &instance->thread);
```

### Rule

When declaring pointers, put a space before and after `*`.

#### Wrong

```c
GumModuleDetails *details;
```

#### Correct

```c
GumModuleDetails * details;
```

### Rule

When casting pointers, put a space before `*`.

#### Wrong

```c
init_func = (guint32*) gum_darwin_read (task, addr, sizeof (guint32), NULL);
```

#### Correct

```c
init_func = (guint32 *) gum_darwin_read (task, addr, sizeof (guint32), NULL);
```

### Rule

Space before and after binary operators, no spaces around unary
operators.

#### Wrong

```c
for (port_index=0; port_index!=previous_ports->count; port_index ++)
{
  ...
}

* count ++;
```

#### Correct

```c
for (port_index = 0; port_index != previous_ports->count; port_index++)
{
  ...
}

*count++;
```

### Rule

Never use more than one space (when not used for indentation).

#### Wrong

```c
gint  i;
```

#### Correct

```c
gint i;
```

## Blank Lines

### Rule

It's encouraged to leave **one** blank line when needing to separate
semantically distinct blocks of code or improve readability
(some examples later). Just don't abuse that and never leave more 
than one blank line. (Except for Python code, which should follow the
recommendations in PEP-8.)

#### Wrong

```
static void
function_one (void)
{
  ...
}


static void
function_two (void)
{
  ...
}
```

#### Correct

```
static void
function_one (void)
{
  ...
}

static void
function_two (void)
{
  ...
}
```

## Function definitions

### Rule

Function names must be lowercase, e.g. `find_libsystem`
**NOTE**: this is true also for arguments, variable names, and
labels.

#### Wrong

```c
static gboolean
frida_find_libSystem (const GumModuleDetails * details, gpointer user_data)
{
    ...
}
```

#### Correct

```c
static gboolean
frida_find_libsystem (const GumModuleDetails * details, gpointer user_data)
{
    ...
}
```

### Rule

Functions which take no arguments should be declared `(void)`, as `()`
means that no information about the number or types of the arguments
is supplied. (Unlike C++, where `()` means "no arguments".)

#### Wrong

```c
static gboolean 
function_without_args ()
{
  ...
}
```

#### Correct

```c
static gboolean 
function_without_args (void)
{
  ...
}
```

## Local variables

### Rule

Local variables are all declared at the beginning of the block
they're used in, a blank line is usually left right after.

#### Wrong

```c
  if (is_uninitialized_clone)
  {
    mach_port_mod_refs (self_task, task, MACH_PORT_RIGHT_SEND, 1);
    instance->task = task;

    mach_vm_address_t data_address = instance->remote_agent_context;
    ...
  }
```

#### Correct

```c
  if (is_uninitialized_clone)
  {
    mach_vm_address_t data_address;

    mach_port_mod_refs (self_task, task, MACH_PORT_RIGHT_SEND, 1);
    instance->task = task;

    data_address = instance->remote_agent_context;
    ...
  }
```

### Rule

Local variables are listed in chronological order of usage.

**Exception 1**: the variable which holds the return value of a
function should be the first in the list, preceded by any variable
holding argument values.

**Exception 2**: related variables of the same type can be grouped in
one line, in relative chronological order.

#### Example 1

Variables in chronological order of usage.

```c
    case FRIDA_BREAKPOINT_CLEANUP:
    {
      task_t self_task;
      gsize page_size;
      FridaExceptionPortSet * previous_ports;
      mach_msg_type_number_t port_index;
      guint i;

      self_task = mach_task_self ();
      page_size = getpagesize ();

      previous_ports = &self->previous_ports;
      for (port_index = 0; port_index != previous_ports->count; port_index++)
      {
        ...
      }
      
      ...

      for (i = 0; i != FRIDA_MAX_BREAKPOINTS; i++)
        frida_spawn_instance_unset_nth_breakpoint (self, i);
    }
```

#### Example 2

The variable holding the return value comes first.

```c
static csh
frida_create_capstone (GumCpuType cpu_type, GumAddress start)
{
  csh capstone;
  cs_err err;

  switch (cpu_type)
  {
    case GUM_CPU_ARM64:
      err = cs_open (CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN, &capstone);
      break;
    ...
  }

  g_assert (err == CS_ERR_OK);

  return capstone;
}
```

#### Example 3

Argument helper variable before return value.

```c
guint
_frida_darwin_helper_backend_demonitor_and_clone_injectee_state (FridaDarwinHelperBackend * self, void * raw_instance)
{
  FridaInjectInstance * instance = raw_instance;
  FridaInjectInstance * clone;

  ...

  return clone->id;
}
```

### Rule

Avoid redundant initialization.

#### Wrong

```c
cs_insn * insn = NULL;

...

insn = cs_malloc (capstone);
```

#### Correct

```c
cs_insn * insn;

...

insn = cs_malloc (capstone);
```

## Indentation and {}

### Rule

In function definitions, the return type goes on its own line (not
for the prototype).

#### Wrong

```c
static gboolean frida_find_libsystem (const GumModuleDetails * details, gpointer user_data)
{
  ...
}
```

#### Correct

```c
static gboolean
frida_find_libsystem (const GumModuleDetails * details, gpointer user_data)
{
  ...
}
```

### Rule

Curly braces go on a new line, in all cases.

#### Wrong

```c
if (cached_address_for_breakpoint[instance->cpu_type] == 0) {
  ...
}
```

#### Correct

```c
if (cached_address_for_breakpoint[instance->cpu_type] == 0) 
{
  ...
}
```

### Rule

Code in a block is indented by 2 spaces.

#### Wrong

```c
if (magic == NULL)
    goto handle_probe_dyld_error;
```

#### Correct

```c
if (magic == NULL)
  goto handle_probe_dyld_error;
```

### Rule

Simple `if` statements in which the code is only one line should not
have curly braces.

#### Wrong

```c
if (magic == NULL)
{
  goto handle_probe_dyld_error;
}
```

#### Correct

```c
if (magic == NULL)
  goto handle_probe_dyld_error;
```

### Rule

If the `if` statement has curly braces, then also the `else` should
have it (and vice-versa).

#### Wrong

```c
    if (error == nil)
      [service cleanupClientPort:client_port];
    else
    {
      g_clear_object (&pipes);

      frida_error = g_error_new (
          FRIDA_ERROR,
          FRIDA_ERROR_NOT_SUPPORTED,
          "Unable to launch iOS app: %s",
          [[error localizedDescription] UTF8String]);
    }
```

#### Correct

```c
    if (error == nil)
    {
      [service cleanupClientPort:client_port];
    }
    else
    {
      g_clear_object (&pipes);

      frida_error = g_error_new (
          FRIDA_ERROR,
          FRIDA_ERROR_NOT_SUPPORTED,
          "Unable to launch iOS app: %s",
          [[error localizedDescription] UTF8String]);
    }
```

### Rule

When an `if` statement has single-statement bodies but any of them
exceed the maximum line length, curly braces must be used.

#### Wrong

```c
  if (_frida_get_springboard_api ()->fbs != NULL)
    frida_darwin_helper_backend_launch_using_fbs (identifier_value, url_value, options, aux_options, on_complete,
        on_complete_target);
  else
    frida_darwin_helper_backend_launch_using_sbs (identifier_value, url_value, options, aux_options, on_complete,
        on_complete_target);
```

#### Correct

```c
  if (_frida_get_springboard_api ()->fbs != NULL)
  {
    frida_darwin_helper_backend_launch_using_fbs (identifier_value, url_value, options, aux_options, on_complete,
        on_complete_target);
  }
  else
  {
    frida_darwin_helper_backend_launch_using_sbs (identifier_value, url_value, options, aux_options, on_complete,
        on_complete_target);
  }
```

### Rule

If the condition of an `if` statement has been broken up into multiple
lines, then use braces regardless.

#### Wrong

```c
    if ((ctx->sink_mask & GUM_BLOCK) != 0 &&
        gum_x86_relocator_eob (rl) &&
        insn.ci->id != X86_INS_CALL)
      gum_exec_block_write_block_event_code (block, &gc, GUM_CODE_INTERRUPTIBLE);
```

#### Correct

```c
    if ((ctx->sink_mask & GUM_BLOCK) != 0 &&
        gum_x86_relocator_eob (rl) &&
        insn.ci->id != X86_INS_CALL)
    {
      gum_exec_block_write_block_event_code (block, &gc, GUM_CODE_INTERRUPTIBLE);
    }
```

## Switch statements

### Rule

If a case needs curly braces, the `break` goes inside, usually
preceded by a blank line.

#### Wrong

```c
switch (cpu_type)
{
  case GUM_CPU_ARM:
  {
    /* case implementation*/
  }
  break;
  
  ...
}
```

#### Correct

```c
switch (cpu_type)
{
  case GUM_CPU_ARM:
  {
    /* case implementation*/
    
    break;
  }
  
  ...
}
```

# Rules for JavaScript

This set of rules apply to JavaScript code, regardless of the project owning it.

## String constants

### Rule

Don't use double quotes.

#### Wrong

```javascript
throw new Error("Invalid argument");
```

#### Correct

```javascript
throw new Error('Invalid argument');
```

## Indentation

### Rule

Indent with 2 spaces.

### Rule

Curly braces go on the same line of the statement.

#### Wrong

```javascript
if (condition)
{
  ...
}
else
{
  ...
}
```

#### Correct

```javascript
if (condition) {
  ...
} else {
  ...
}
```

## Semicolons

### Rule

Treat semicolons as mandatory.

#### Wrong

```javascript
console.log('hello world')
```

#### Correct

```javascript
console.log('hello world');
```

## Comparisons

### Rule

Use strict comparisons.

#### Wrong

```javascript
if (methodName == '- init') {
  ...
}
```

#### Correct

```javascript
if (methodName === '- init') {
  ...
}
```

### Rule

Put parenthesis around the ternary comparison condition unless it's
simply referencing a boolean variable.

#### Wrong

```javascript
m = res[0] === '' ? '*' : res[0];
```

#### Correct

```javascript
m = (res[0] === '') ? '*' : res[0];
```

## Spaces

### Rule

Unless the specific project follows the semistandard conventions, put no
spaces between function name and argument list.

#### Wrong

```javascript
function parseExportsFunctionPattern (pattern) {
  var res = pattern.split ('!');
  ...
}
```

#### Correct

```javascript
function parseExportsFunctionPattern(pattern) {
  var res = pattern.split('!');
  ...
}
```

## Object properties

### Rule

Reference object properties without quotes when possible.

#### Wrong

```javascript
enumerateMatches('exports:' + obj['module'] + '!' + obj['function']);
```

#### Correct

```javascript
enumerateMatches('exports:' + obj.module + '!' + obj.function);
```

## Internal agents

### Rule

Stick to `ES5` syntax, so it can be consumed by the Duktape runtime
without having to first `frida-compile` the code.

### Rule

In `rpc.exports`, `dispose()` comes first, or right after `init()`.

# Rules for TypeScript

This set of rules apply to TypeScript code, regardless of the project
owning it. Rules for JavaScript also apply to TypeScript, if not
explicitly overridden.

## Indentation

### Rule

Indent with 4 spaces.

## Spaces

### Rule

Never put spaces between function name and argument list, neither in
calls nor definitions.

## String constants

### Rule

Don't use single quotes.

## Enums

### Rule

The TypeScript convention is pascal-case for enum values,
e.g. `FooBarBaz`.

#### Wrong

```typescript
enum PlistType {
    NONE,
    BINARY,
    XML
}
```

#### Correct

```typescript
enum PlistType {
    None,
    Binary,
    Xml
}
```

### Rule

Usage of `const enum` is discouraged portability-wise.

#### Wrong

```typescript
export const enum GrassColor {
    Yellow = "YELLOW",
    LightGreen = "LIGHTGREEN",
    Green = "GREEN",
    DarkGreen = "DARKGREEN"
}
```

#### Correct

```typescript
export type GrassColor = 
    | "YELLOW" 
    | "LIGHTGREEN" 
    | "GREEN" 
    | "DARKGREEN"
    ;
```

## Constants

### Rule

Constants should be uppercase, e.g. `FOO_BAR_BAZ`.

#### Wrong

```typescript
const lockdownPort = 62078;
```

#### Correct

```typescript
const LOCKDOWN_PORT = 62078;
```

## Types

### Rule

Use `interface` when possible.

#### Wrong

```typescript
export type StringDict = {
    [name: string]: string;
}
```

#### Correct

```typescript
export interface StringDict {
    [name: string]: string;
}
```

# Rules for Vala

This set of rules apply to Vala code, regardless of the project
owning it.

## Order of class properties

### Rule

* Public properties should precede private ones.
* Higher level properties should precede lower level ones.

## Indentation, spaces and {}

### Rule

Indent only with tabs.

### Rule

Rules for spaces are the same as C.

### Rule

Curly braces go on the same line of the statement. Follow the same
rules as C for whether to omit them or not.

#### Wrong

```vala
if (condition)
{
  ...
}
else
{
  ...
}
```

#### Correct

```vala
if (condition) {
  ...
} else {
  ...
}
```

## Usage of `var` type

### Rule

Declare variables as `var`, especially when the type is obvious.

#### Wrong

```vala
Json.Node parameters = new Json.Node (Json.NodeType.OBJECT);
```

#### Correct

```vala
var parameters = new Json.Node (Json.NodeType.OBJECT);
```

# Generic rules for Python

This set of rules apply to all python code, regardless of the project
it belongs to.

## Formatting

### Rule

Python formatting should follow the 
[PEP-8](https://www.python.org/dev/peps/pep-0008/) guidelines.

## String quotes

### Rule

Use double quotes for regular strings, single quotes for enum-like
values.

#### Wrong

```python
if os.environ.get("TERM", '') == "dumb":
```

#### Correct

```python
if os.environ.get("TERM", "") == 'dumb':
```

## Imports

### Rule

Imports go in alphabetical order.

## Comments

### Rule

Comments should use a capital letter at the start of each sentence,
and each should end in a full stop.

# Generic rules in frida-gum

This set of rules apply to all code in frida-gum, regardless of the
language.

## Max line length

### Rule

Lines should not exceed 80 characters.

# Rules for C code in frida-gum

## Function definitions

### Rule

When defining a function implementation each argument must go on
its own line, vertically aligned (not for the prototype).

#### Wrong

```c
static void
gum_exec_block_write_block_event_code (GumExecBlock * block, GumGeneratorContext * gc,
                                       GumCodeContext cc)
{
  ...
}
```

#### Correct

```c
static void
gum_exec_block_write_block_event_code (GumExecBlock * block,
                                       GumGeneratorContext * gc,
                                       GumCodeContext cc)
{
  ...
}
```

# Generic rules in frida-core

This set of rules apply to all code in frida-core, regardless of the
language.

## Max line length

### Rule

Lines should not exceed 140 characters.

# Rules for C code in frida-core

This set of rules apply to C code belonging to frida-core.

## Function definitions

### Rule

Function names should be “namespaced” by having a `frida_` prefix,
even if static.

#### Wrong

```c
static gboolean
find_libsystem (const GumModuleDetails * details, gpointer user_data)
{
  ...
}
```

#### Correct

```c
static gboolean
frida_find_libsystem (const GumModuleDetails * details, gpointer user_data)
{
  ...
}
```
>>>>>>> 4a7254c503971088297a01c775e4810597e83d74
