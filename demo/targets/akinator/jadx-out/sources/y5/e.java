package y5;

import android.content.Context;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: f, reason: collision with root package name */
    public static final b f94075f = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f94076a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94077b;

    /* renamed from: c, reason: collision with root package name */
    public final d f94078c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f94079d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f94080e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f94081a;

        /* renamed from: b, reason: collision with root package name */
        public String f94082b;

        /* renamed from: c, reason: collision with root package name */
        public d f94083c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f94084d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f94085e;

        public a(Context context) {
            e0.checkNotNullParameter(context, "context");
            this.f94081a = context;
        }

        public a allowDataLossOnRecovery(boolean z10) {
            this.f94085e = z10;
            return this;
        }

        public e build() {
            String str;
            d dVar = this.f94083c;
            if (dVar == null) {
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }
            if (this.f94084d && ((str = this.f94082b) == null || str.length() == 0)) {
                throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
            }
            return new e(this.f94081a, this.f94082b, dVar, this.f94084d, this.f94085e);
        }

        public a callback(d callback) {
            e0.checkNotNullParameter(callback, "callback");
            this.f94083c = callback;
            return this;
        }

        public a name(String str) {
            this.f94082b = str;
            return this;
        }

        public a noBackupDirectory(boolean z10) {
            this.f94084d = z10;
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(u uVar) {
        }

        public final a builder(Context context) {
            e0.checkNotNullParameter(context, "context");
            return new a(context);
        }
    }

    public e(Context context, String str, d callback, boolean z10, boolean z11) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(callback, "callback");
        this.f94076a = context;
        this.f94077b = str;
        this.f94078c = callback;
        this.f94079d = z10;
        this.f94080e = z11;
    }

    public static final a builder(Context context) {
        return f94075f.builder(context);
    }

    public /* synthetic */ e(Context context, String str, d dVar, boolean z10, boolean z11, int i10, u uVar) {
        this(context, str, dVar, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11);
    }
}
