package f;

import android.os.Build;
import android.window.BackEvent;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f55200a;

    /* renamed from: b, reason: collision with root package name */
    public final float f55201b;

    /* renamed from: c, reason: collision with root package name */
    public final float f55202c;

    /* renamed from: d, reason: collision with root package name */
    public final int f55203d;

    /* renamed from: e, reason: collision with root package name */
    public final long f55204e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public c(float f10, float f11, float f12, int i10) {
        this(f10, f11, f12, i10, 0L, 16, null);
    }

    public final long getFrameTimeMillis() {
        return this.f55204e;
    }

    public final float getProgress() {
        return this.f55202c;
    }

    public final int getSwipeEdge() {
        return this.f55203d;
    }

    public final float getTouchX() {
        return this.f55200a;
    }

    public final float getTouchY() {
        return this.f55201b;
    }

    public final BackEvent toBackEvent() {
        if (Build.VERSION.SDK_INT >= 36) {
            return b.f55195a.createOnBackEvent(this.f55200a, this.f55201b, this.f55202c, this.f55203d, this.f55204e);
        }
        return f.a.f55193a.createOnBackEvent(this.f55200a, this.f55201b, this.f55202c, this.f55203d);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BackEventCompat{touchX=");
        sb2.append(this.f55200a);
        sb2.append(", touchY=");
        sb2.append(this.f55201b);
        sb2.append(", progress=");
        sb2.append(this.f55202c);
        sb2.append(", swipeEdge=");
        sb2.append(this.f55203d);
        sb2.append(", frameTimeMillis=");
        return e3.g.n(sb2, this.f55204e, AbstractJsonLexerKt.END_OBJ);
    }

    public c(float f10, float f11, float f12, int i10, long j10) {
        this.f55200a = f10;
        this.f55201b = f11;
        this.f55202c = f12;
        this.f55203d = i10;
        this.f55204e = j10;
    }

    public /* synthetic */ c(float f10, float f11, float f12, int i10, long j10, int i11, kotlin.jvm.internal.u uVar) {
        this(f10, f11, f12, i10, (i11 & 16) != 0 ? 0L : j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(BackEvent backEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(backEvent, "backEvent");
        f.a aVar = f.a.f55193a;
        this(aVar.touchX(backEvent), aVar.touchY(backEvent), aVar.progress(backEvent), aVar.swipeEdge(backEvent), Build.VERSION.SDK_INT >= 36 ? b.f55195a.frameTimeMillis(backEvent) : 0L);
    }
}
