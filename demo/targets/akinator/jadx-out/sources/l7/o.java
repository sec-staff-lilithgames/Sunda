package l7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import kotlin.jvm.internal.e0;
import xv.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f72623a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f72624b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorSpace f72625c;

    /* renamed from: d, reason: collision with root package name */
    public final m7.j f72626d;

    /* renamed from: e, reason: collision with root package name */
    public final m7.i f72627e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f72628f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f72629g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f72630h;

    /* renamed from: i, reason: collision with root package name */
    public final String f72631i;

    /* renamed from: j, reason: collision with root package name */
    public final f0 f72632j;

    /* renamed from: k, reason: collision with root package name */
    public final t f72633k;

    /* renamed from: l, reason: collision with root package name */
    public final p f72634l;

    /* renamed from: m, reason: collision with root package name */
    public final b f72635m;

    /* renamed from: n, reason: collision with root package name */
    public final b f72636n;

    /* renamed from: o, reason: collision with root package name */
    public final b f72637o;

    public o(Context context, Bitmap.Config config, ColorSpace colorSpace, m7.j jVar, m7.i iVar, boolean z10, boolean z11, boolean z12, String str, f0 f0Var, t tVar, p pVar, b bVar, b bVar2, b bVar3) {
        this.f72623a = context;
        this.f72624b = config;
        this.f72625c = colorSpace;
        this.f72626d = jVar;
        this.f72627e = iVar;
        this.f72628f = z10;
        this.f72629g = z11;
        this.f72630h = z12;
        this.f72631i = str;
        this.f72632j = f0Var;
        this.f72633k = tVar;
        this.f72634l = pVar;
        this.f72635m = bVar;
        this.f72636n = bVar2;
        this.f72637o = bVar3;
    }

    public final o copy(Context context, Bitmap.Config config, ColorSpace colorSpace, m7.j jVar, m7.i iVar, boolean z10, boolean z11, boolean z12, String str, f0 f0Var, t tVar, p pVar, b bVar, b bVar2, b bVar3) {
        return new o(context, config, colorSpace, jVar, iVar, z10, z11, z12, str, f0Var, tVar, pVar, bVar, bVar2, bVar3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (e0.areEqual(this.f72623a, oVar.f72623a) && this.f72624b == oVar.f72624b) {
            return (Build.VERSION.SDK_INT < 26 || e0.areEqual(this.f72625c, oVar.f72625c)) && e0.areEqual(this.f72626d, oVar.f72626d) && this.f72627e == oVar.f72627e && this.f72628f == oVar.f72628f && this.f72629g == oVar.f72629g && this.f72630h == oVar.f72630h && e0.areEqual(this.f72631i, oVar.f72631i) && e0.areEqual(this.f72632j, oVar.f72632j) && e0.areEqual(this.f72633k, oVar.f72633k) && e0.areEqual(this.f72634l, oVar.f72634l) && this.f72635m == oVar.f72635m && this.f72636n == oVar.f72636n && this.f72637o == oVar.f72637o;
        }
        return false;
    }

    public final boolean getAllowInexactSize() {
        return this.f72628f;
    }

    public final boolean getAllowRgb565() {
        return this.f72629g;
    }

    public final ColorSpace getColorSpace() {
        return this.f72625c;
    }

    public final Bitmap.Config getConfig() {
        return this.f72624b;
    }

    public final Context getContext() {
        return this.f72623a;
    }

    public final String getDiskCacheKey() {
        return this.f72631i;
    }

    public final b getDiskCachePolicy() {
        return this.f72636n;
    }

    public final f0 getHeaders() {
        return this.f72632j;
    }

    public final b getMemoryCachePolicy() {
        return this.f72635m;
    }

    public final b getNetworkCachePolicy() {
        return this.f72637o;
    }

    public final p getParameters() {
        return this.f72634l;
    }

    public final boolean getPremultipliedAlpha() {
        return this.f72630h;
    }

    public final m7.i getScale() {
        return this.f72627e;
    }

    public final m7.j getSize() {
        return this.f72626d;
    }

    public final t getTags() {
        return this.f72633k;
    }

    public int hashCode() {
        int iHashCode = (this.f72624b.hashCode() + (this.f72623a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f72625c;
        int iC = com.google.android.gms.internal.play_billing.a.c(com.google.android.gms.internal.play_billing.a.c(com.google.android.gms.internal.play_billing.a.c((this.f72627e.hashCode() + ((this.f72626d.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f72628f), 31, this.f72629g), 31, this.f72630h);
        String str = this.f72631i;
        return this.f72637o.hashCode() + ((this.f72636n.hashCode() + ((this.f72635m.hashCode() + ((this.f72634l.hashCode() + ((this.f72633k.hashCode() + ((this.f72632j.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ o(Context context, Bitmap.Config config, ColorSpace colorSpace, m7.j jVar, m7.i iVar, boolean z10, boolean z11, boolean z12, String str, f0 f0Var, t tVar, p pVar, b bVar, b bVar2, b bVar3, int i10, kotlin.jvm.internal.u uVar) {
        Bitmap.Config config2 = (i10 & 2) != 0 ? Bitmap.Config.ARGB_8888 : config;
        ColorSpace null_color_space = (i10 & 4) != 0 ? q7.n.getNULL_COLOR_SPACE() : colorSpace;
        m7.j jVar2 = (i10 & 8) != 0 ? m7.j.f74065c : jVar;
        m7.i iVar2 = (i10 & 16) != 0 ? m7.i.f74063c : iVar;
        boolean z13 = (i10 & 32) != 0 ? false : z10;
        boolean z14 = (i10 & 64) == 0 ? z11 : false;
        boolean z15 = (i10 & 128) != 0 ? true : z12;
        String str2 = (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : str;
        f0 empty_headers = (i10 & 512) != 0 ? q7.n.getEMPTY_HEADERS() : f0Var;
        t tVar2 = (i10 & 1024) != 0 ? t.f72654c : tVar;
        p pVar2 = (i10 & 2048) != 0 ? p.f72638c : pVar;
        int i11 = i10 & 4096;
        b bVar4 = b.ENABLED;
        this(context, config2, null_color_space, jVar2, iVar2, z13, z14, z15, str2, empty_headers, tVar2, pVar2, i11 != 0 ? bVar4 : bVar, (i10 & Segment.SIZE) != 0 ? bVar4 : bVar2, (i10 & 16384) != 0 ? bVar4 : bVar3);
    }
}
