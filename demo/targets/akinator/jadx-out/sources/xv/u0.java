package xv;

import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class u0 {
    public static final a Companion;
    public static final u0 EMPTY;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public static /* synthetic */ u0 create$default(a aVar, String str, j0 j0Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j0Var = null;
            }
            return aVar.create(str, j0Var);
        }

        @tu.f
        public final u0 create(j0 j0Var, byte[] content) {
            kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
            return create$default(this, j0Var, content, 0, 0, 12, (Object) null);
        }

        public static /* synthetic */ u0 create$default(a aVar, pw.l lVar, j0 j0Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j0Var = null;
            }
            return aVar.create(lVar, j0Var);
        }

        @tu.f
        public final u0 create(j0 j0Var, byte[] content, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
            return create$default(this, j0Var, content, i10, 0, 8, (Object) null);
        }

        public static /* synthetic */ u0 create$default(a aVar, FileDescriptor fileDescriptor, j0 j0Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j0Var = null;
            }
            return aVar.create(fileDescriptor, j0Var);
        }

        public final u0 create(byte[] bArr) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
            return create$default(this, bArr, (j0) null, 0, 0, 7, (Object) null);
        }

        public static /* synthetic */ u0 create$default(a aVar, byte[] bArr, j0 j0Var, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                j0Var = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.create(bArr, j0Var, i10, i11);
        }

        public final u0 create(byte[] bArr, j0 j0Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
            return create$default(this, bArr, j0Var, 0, 0, 6, (Object) null);
        }

        public final u0 create(byte[] bArr, j0 j0Var, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
            return create$default(this, bArr, j0Var, i10, 0, 4, (Object) null);
        }

        public static /* synthetic */ u0 create$default(a aVar, File file, j0 j0Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j0Var = null;
            }
            return aVar.create(file, j0Var);
        }

        public final u0 create(String str, j0 j0Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
            tu.v vVarChooseCharset = yv.a.chooseCharset(j0Var);
            Charset charset = (Charset) vVarChooseCharset.component1();
            j0 j0Var2 = (j0) vVarChooseCharset.component2();
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return create(bytes, j0Var2, 0, bytes.length);
        }

        public static /* synthetic */ u0 create$default(a aVar, pw.n0 n0Var, pw.r rVar, j0 j0Var, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                j0Var = null;
            }
            return aVar.create(n0Var, rVar, j0Var);
        }

        public static /* synthetic */ u0 create$default(a aVar, j0 j0Var, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return aVar.create(j0Var, bArr, i10, i11);
        }

        public final u0 create(pw.l lVar, j0 j0Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(lVar, "<this>");
            return new r0(j0Var, lVar);
        }

        public final u0 create(FileDescriptor fileDescriptor, j0 j0Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(fileDescriptor, "<this>");
            return new s0(fileDescriptor, j0Var);
        }

        public final u0 create(byte[] bArr, j0 j0Var, int i10, int i11) {
            kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
            yv.h.checkOffsetAndCount(bArr.length, i10, i11);
            return new t0(j0Var, bArr, i11, i10);
        }

        public final u0 create(File file, j0 j0Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(file, "<this>");
            return new p0(j0Var, file);
        }

        public final u0 create(pw.n0 n0Var, pw.r fileSystem, j0 j0Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(n0Var, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(fileSystem, "fileSystem");
            return new q0(n0Var, fileSystem, j0Var);
        }

        @tu.f
        public final u0 create(j0 j0Var, String content) {
            kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
            return create(content, j0Var);
        }

        @tu.f
        public final u0 create(j0 j0Var, pw.l content) {
            kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
            return create(content, j0Var);
        }

        @tu.f
        public final u0 create(j0 j0Var, byte[] content, int i10, int i11) {
            kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
            return create(content, j0Var, i10, i11);
        }

        @tu.f
        public final u0 create(j0 j0Var, File file) {
            kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
            return create(file, j0Var);
        }
    }

    static {
        a aVar = new a(null);
        Companion = aVar;
        EMPTY = a.create$default(aVar, pw.l.f81912g, (j0) null, 1, (Object) null);
    }

    public static final u0 create(File file, j0 j0Var) {
        return Companion.create(file, j0Var);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract j0 contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(pw.j jVar) throws IOException;

    public static final u0 create(FileDescriptor fileDescriptor, j0 j0Var) {
        return Companion.create(fileDescriptor, j0Var);
    }

    public static final u0 create(String str, j0 j0Var) {
        return Companion.create(str, j0Var);
    }

    public static final u0 create(pw.l lVar, j0 j0Var) {
        return Companion.create(lVar, j0Var);
    }

    public static final u0 create(pw.n0 n0Var, pw.r rVar, j0 j0Var) {
        return Companion.create(n0Var, rVar, j0Var);
    }

    @tu.f
    public static final u0 create(j0 j0Var, File file) {
        return Companion.create(j0Var, file);
    }

    @tu.f
    public static final u0 create(j0 j0Var, String str) {
        return Companion.create(j0Var, str);
    }

    @tu.f
    public static final u0 create(j0 j0Var, pw.l lVar) {
        return Companion.create(j0Var, lVar);
    }

    @tu.f
    public static final u0 create(j0 j0Var, byte[] bArr) {
        return Companion.create(j0Var, bArr);
    }

    @tu.f
    public static final u0 create(j0 j0Var, byte[] bArr, int i10) {
        return Companion.create(j0Var, bArr, i10);
    }

    @tu.f
    public static final u0 create(j0 j0Var, byte[] bArr, int i10, int i11) {
        return Companion.create(j0Var, bArr, i10, i11);
    }

    public static final u0 create(byte[] bArr) {
        return Companion.create(bArr);
    }

    public static final u0 create(byte[] bArr, j0 j0Var) {
        return Companion.create(bArr, j0Var);
    }

    public static final u0 create(byte[] bArr, j0 j0Var, int i10) {
        return Companion.create(bArr, j0Var, i10);
    }

    public static final u0 create(byte[] bArr, j0 j0Var, int i10, int i11) {
        return Companion.create(bArr, j0Var, i10, i11);
    }
}
