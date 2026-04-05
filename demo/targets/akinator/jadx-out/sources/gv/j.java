package gv;

import b0.e2;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j implements rv.t {

    /* renamed from: a, reason: collision with root package name */
    public final File f58480a;

    /* renamed from: b, reason: collision with root package name */
    public final l f58481b;

    /* renamed from: c, reason: collision with root package name */
    public final kv.l f58482c;

    /* renamed from: d, reason: collision with root package name */
    public final kv.l f58483d;

    /* renamed from: e, reason: collision with root package name */
    public final kv.p f58484e;

    /* renamed from: f, reason: collision with root package name */
    public final int f58485f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File rootDir) {
            super(rootDir);
            e0.checkNotNullParameter(rootDir, "rootDir");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b extends uu.b {

        /* renamed from: e, reason: collision with root package name */
        public final ArrayDeque f58486e;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public final class a extends a {

            /* renamed from: b, reason: collision with root package name */
            public boolean f58488b;

            /* renamed from: c, reason: collision with root package name */
            public File[] f58489c;

            /* renamed from: d, reason: collision with root package name */
            public int f58490d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f58491e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ b f58492f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File rootDir) {
                super(rootDir);
                e0.checkNotNullParameter(rootDir, "rootDir");
                this.f58492f = bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
            @Override // gv.j.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File step() {
                /*
                    r11 = this;
                    boolean r0 = r11.f58491e
                    r1 = 0
                    r2 = 1
                    gv.j$b r3 = r11.f58492f
                    if (r0 != 0) goto L50
                    java.io.File[] r0 = r11.f58489c
                    if (r0 != 0) goto L50
                    gv.j r0 = gv.j.this
                    kv.l r0 = gv.j.access$getOnEnter$p(r0)
                    if (r0 == 0) goto L25
                    java.io.File r4 = r11.getRoot()
                    java.lang.Object r0 = r0.invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L25
                    goto L84
                L25:
                    java.io.File r0 = r11.getRoot()
                    java.io.File[] r0 = r0.listFiles()
                    r11.f58489c = r0
                    if (r0 != 0) goto L50
                    gv.j r0 = gv.j.this
                    kv.p r0 = gv.j.access$getOnFail$p(r0)
                    if (r0 == 0) goto L4e
                    java.io.File r4 = r11.getRoot()
                    gv.a r5 = new gv.a
                    java.io.File r6 = r11.getRoot()
                    r9 = 2
                    r10 = 0
                    r7 = 0
                    java.lang.String r8 = "Cannot list files in a directory"
                    r5.<init>(r6, r7, r8, r9, r10)
                    r0.invoke(r4, r5)
                L4e:
                    r11.f58491e = r2
                L50:
                    java.io.File[] r0 = r11.f58489c
                    if (r0 == 0) goto L6a
                    int r4 = r11.f58490d
                    kotlin.jvm.internal.e0.checkNotNull(r0)
                    int r0 = r0.length
                    if (r4 >= r0) goto L6a
                    java.io.File[] r0 = r11.f58489c
                    kotlin.jvm.internal.e0.checkNotNull(r0)
                    int r1 = r11.f58490d
                    int r2 = r1 + 1
                    r11.f58490d = r2
                    r0 = r0[r1]
                    return r0
                L6a:
                    boolean r0 = r11.f58488b
                    if (r0 != 0) goto L75
                    r11.f58488b = r2
                    java.io.File r0 = r11.getRoot()
                    return r0
                L75:
                    gv.j r0 = gv.j.this
                    kv.l r0 = gv.j.access$getOnLeave$p(r0)
                    if (r0 == 0) goto L84
                    java.io.File r2 = r11.getRoot()
                    r0.invoke(r2)
                L84:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: gv.j.b.a.step():java.io.File");
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: gv.j$b$b, reason: collision with other inner class name */
        public final class C0576b extends c {

            /* renamed from: b, reason: collision with root package name */
            public boolean f58493b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0576b(b bVar, File rootFile) {
                super(rootFile);
                e0.checkNotNullParameter(rootFile, "rootFile");
            }

            @Override // gv.j.c
            public File step() {
                if (this.f58493b) {
                    return null;
                }
                this.f58493b = true;
                return getRoot();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            public boolean f58494b;

            /* renamed from: c, reason: collision with root package name */
            public File[] f58495c;

            /* renamed from: d, reason: collision with root package name */
            public int f58496d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b f58497e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                e0.checkNotNullParameter(rootDir, "rootDir");
                this.f58497e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
            
                if (r0.length == 0) goto L31;
             */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
            @Override // gv.j.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File step() {
                /*
                    r10 = this;
                    boolean r0 = r10.f58494b
                    r1 = 0
                    gv.j$b r2 = r10.f58497e
                    if (r0 != 0) goto L28
                    gv.j r0 = gv.j.this
                    kv.l r0 = gv.j.access$getOnEnter$p(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r10.getRoot()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    goto L8b
                L20:
                    r0 = 1
                    r10.f58494b = r0
                    java.io.File r0 = r10.getRoot()
                    return r0
                L28:
                    java.io.File[] r0 = r10.f58495c
                    if (r0 == 0) goto L45
                    int r3 = r10.f58496d
                    kotlin.jvm.internal.e0.checkNotNull(r0)
                    int r0 = r0.length
                    if (r3 >= r0) goto L35
                    goto L45
                L35:
                    gv.j r0 = gv.j.this
                    kv.l r0 = gv.j.access$getOnLeave$p(r0)
                    if (r0 == 0) goto L8b
                    java.io.File r2 = r10.getRoot()
                    r0.invoke(r2)
                    return r1
                L45:
                    java.io.File[] r0 = r10.f58495c
                    if (r0 != 0) goto L8c
                    java.io.File r0 = r10.getRoot()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f58495c = r0
                    if (r0 != 0) goto L72
                    gv.j r0 = gv.j.this
                    kv.p r0 = gv.j.access$getOnFail$p(r0)
                    if (r0 == 0) goto L72
                    java.io.File r3 = r10.getRoot()
                    gv.a r4 = new gv.a
                    java.io.File r5 = r10.getRoot()
                    r8 = 2
                    r9 = 0
                    r6 = 0
                    java.lang.String r7 = "Cannot list files in a directory"
                    r4.<init>(r5, r6, r7, r8, r9)
                    r0.invoke(r3, r4)
                L72:
                    java.io.File[] r0 = r10.f58495c
                    if (r0 == 0) goto L7c
                    kotlin.jvm.internal.e0.checkNotNull(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L8c
                L7c:
                    gv.j r0 = gv.j.this
                    kv.l r0 = gv.j.access$getOnLeave$p(r0)
                    if (r0 == 0) goto L8b
                    java.io.File r2 = r10.getRoot()
                    r0.invoke(r2)
                L8b:
                    return r1
                L8c:
                    java.io.File[] r0 = r10.f58495c
                    kotlin.jvm.internal.e0.checkNotNull(r0)
                    int r1 = r10.f58496d
                    int r2 = r1 + 1
                    r10.f58496d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: gv.j.b.c.step():java.io.File");
            }
        }

        public b() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f58486e = arrayDeque;
            if (j.this.f58480a.isDirectory()) {
                arrayDeque.push(b(j.this.f58480a));
            } else if (j.this.f58480a.isFile()) {
                arrayDeque.push(new C0576b(this, j.this.f58480a));
            } else {
                this.f88703b = 2;
            }
        }

        @Override // uu.b
        public final void a() {
            File file;
            File fileStep;
            while (true) {
                ArrayDeque arrayDeque = this.f58486e;
                c cVar = (c) arrayDeque.peek();
                if (cVar == null) {
                    file = null;
                    break;
                }
                fileStep = cVar.step();
                if (fileStep == null) {
                    arrayDeque.pop();
                } else if (e0.areEqual(fileStep, cVar.getRoot()) || !fileStep.isDirectory() || arrayDeque.size() >= j.this.f58485f) {
                    break;
                } else {
                    arrayDeque.push(b(fileStep));
                }
            }
            file = fileStep;
            if (file == null) {
                this.f88703b = 2;
            } else {
                this.f88704c = file;
                this.f88703b = 1;
            }
        }

        public final a b(File file) {
            int i10 = k.$EnumSwitchMapping$0[j.this.f58481b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new tu.t();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final File f58498a;

        public c(File root) {
            e0.checkNotNullParameter(root, "root");
            this.f58498a = root;
        }

        public final File getRoot() {
            return this.f58498a;
        }

        public abstract File step();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(File start, l direction) {
        this(start, direction, null, null, null, Integer.MAX_VALUE);
        e0.checkNotNullParameter(start, "start");
        e0.checkNotNullParameter(direction, "direction");
    }

    @Override // rv.t
    public Iterator<File> iterator() {
        return new b();
    }

    public final j maxDepth(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(e2.h('.', "depth must be positive, but was ", i10));
        }
        return new j(this.f58480a, this.f58481b, this.f58482c, this.f58483d, this.f58484e, i10);
    }

    public final j onEnter(kv.l function) {
        e0.checkNotNullParameter(function, "function");
        return new j(this.f58480a, this.f58481b, function, this.f58483d, this.f58484e, this.f58485f);
    }

    public final j onFail(kv.p function) {
        e0.checkNotNullParameter(function, "function");
        return new j(this.f58480a, this.f58481b, this.f58482c, this.f58483d, function, this.f58485f);
    }

    public final j onLeave(kv.l function) {
        e0.checkNotNullParameter(function, "function");
        return new j(this.f58480a, this.f58481b, this.f58482c, function, this.f58484e, this.f58485f);
    }

    public j(File file, l lVar, kv.l lVar2, kv.l lVar3, kv.p pVar, int i10) {
        this.f58480a = file;
        this.f58481b = lVar;
        this.f58482c = lVar2;
        this.f58483d = lVar3;
        this.f58484e = pVar;
        this.f58485f = i10;
    }

    public /* synthetic */ j(File file, l lVar, int i10, kotlin.jvm.internal.u uVar) {
        this(file, (i10 & 2) != 0 ? l.f58499b : lVar);
    }
}
