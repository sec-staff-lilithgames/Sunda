package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g;
import java.io.File;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class d {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public final File f47999a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(null);
            e0.checkNotNullParameter(file, "file");
            this.f47999a = file;
        }

        public final File a() {
            return this.f47999a;
        }

        public final File b() {
            return this.f47999a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && e0.areEqual(this.f47999a, ((a) obj).f47999a);
        }

        public int hashCode() {
            return this.f47999a.hashCode();
        }

        public String toString() {
            return "Complete(file=" + this.f47999a + ')';
        }

        public final a a(File file) {
            e0.checkNotNullParameter(file, "file");
            return new a(file);
        }

        public static /* synthetic */ a a(a aVar, File file, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                file = aVar.f47999a;
            }
            return aVar.a(file);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public final g.a f48000a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g.a failure) {
            super(null);
            e0.checkNotNullParameter(failure, "failure");
            this.f48000a = failure;
        }

        public final g.a a() {
            return this.f48000a;
        }

        public final g.a b() {
            return this.f48000a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && e0.areEqual(this.f48000a, ((b) obj).f48000a);
        }

        public int hashCode() {
            return this.f48000a.hashCode();
        }

        public String toString() {
            return "Failure(failure=" + this.f48000a + ')';
        }

        public final b a(g.a failure) {
            e0.checkNotNullParameter(failure, "failure");
            return new b(failure);
        }

        public static /* synthetic */ b a(b bVar, g.a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar = bVar.f48000a;
            }
            return bVar.a(aVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public final File f48001a;

        /* renamed from: b, reason: collision with root package name */
        public final C0412d f48002b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(File file, C0412d progress) {
            super(null);
            e0.checkNotNullParameter(file, "file");
            e0.checkNotNullParameter(progress, "progress");
            this.f48001a = file;
            this.f48002b = progress;
        }

        public final File a() {
            return this.f48001a;
        }

        public final C0412d b() {
            return this.f48002b;
        }

        public final File c() {
            return this.f48001a;
        }

        public final C0412d d() {
            return this.f48002b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return e0.areEqual(this.f48001a, cVar.f48001a) && e0.areEqual(this.f48002b, cVar.f48002b);
        }

        public int hashCode() {
            return this.f48002b.hashCode() + (this.f48001a.hashCode() * 31);
        }

        public String toString() {
            return "InProgress(file=" + this.f48001a + ", progress=" + this.f48002b + ')';
        }

        public final c a(File file, C0412d progress) {
            e0.checkNotNullParameter(file, "file");
            e0.checkNotNullParameter(progress, "progress");
            return new c(file, progress);
        }

        public static /* synthetic */ c a(c cVar, File file, C0412d c0412d, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                file = cVar.f48001a;
            }
            if ((i10 & 2) != 0) {
                c0412d = cVar.f48002b;
            }
            return cVar.a(file, c0412d);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d$d, reason: collision with other inner class name */
    public static final class C0412d {

        /* renamed from: a, reason: collision with root package name */
        public final long f48003a;

        /* renamed from: b, reason: collision with root package name */
        public final long f48004b;

        public C0412d(long j10, long j11) {
            this.f48003a = j10;
            this.f48004b = j11;
        }

        public final long a() {
            return this.f48003a;
        }

        public final long b() {
            return this.f48004b;
        }

        public final long c() {
            return this.f48003a;
        }

        public final long d() {
            return this.f48004b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0412d)) {
                return false;
            }
            C0412d c0412d = (C0412d) obj;
            return this.f48003a == c0412d.f48003a && this.f48004b == c0412d.f48004b;
        }

        public int hashCode() {
            return Long.hashCode(this.f48004b) + (Long.hashCode(this.f48003a) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Progress(bytesDownloaded=");
            sb2.append(this.f48003a);
            sb2.append(", totalBytes=");
            return e3.g.n(sb2, this.f48004b, ')');
        }

        public final C0412d a(long j10, long j11) {
            return new C0412d(j10, j11);
        }

        public static /* synthetic */ C0412d a(C0412d c0412d, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = c0412d.f48003a;
            }
            if ((i10 & 2) != 0) {
                j11 = c0412d.f48004b;
            }
            return c0412d.a(j10, j11);
        }
    }

    public /* synthetic */ d(u uVar) {
        this();
    }

    public d() {
    }
}
