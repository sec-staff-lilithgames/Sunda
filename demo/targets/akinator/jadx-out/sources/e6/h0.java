package e6;

import android.graphics.Bitmap;
import android.media.Spatializer;
import android.os.Bundle;
import android.text.Layout;
import android.view.SurfaceView;
import android.view.autofill.AutofillManager;
import io.odeeo.internal.a0.c0;
import io.odeeo.internal.b.g;
import io.odeeo.internal.x.g;
import java.lang.reflect.Constructor;
import java.nio.file.FileVisitResult;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements i0, ee.l, com.google.android.exoplayer2.h, sj.a, ko.e0, g.a, ee.u, gn.p, io.bidmachine.media3.common.util.k, io.odeeo.internal.q0.h, g.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f53818b;

    public /* synthetic */ h0(int i10) {
        this.f53818b = i10;
    }

    public static /* bridge */ /* synthetic */ Spatializer a(Object obj) {
        return (Spatializer) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillManager b(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class c() {
        return AutofillManager.class;
    }

    public static /* bridge */ /* synthetic */ FileVisitResult e(Object obj) {
        return (FileVisitResult) obj;
    }

    @Override // io.bidmachine.media3.common.util.k, com.google.android.exoplayer2.util.h
    public void accept(Object obj) {
        switch (this.f53818b) {
            case 17:
                ((ExecutorService) obj).shutdown();
                break;
            case 18:
            default:
                io.odeeo.internal.a0.j0.a(obj);
                break;
            case 19:
                ((c0.c) obj).f62276b.release();
                break;
        }
    }

    @Override // ko.e0
    /* renamed from: createExtractors, reason: collision with other method in class */
    public ko.z[] mo3833createExtractors() {
        int i10 = this.f53818b;
        hp.p pVar = hp.q.f59124a;
        switch (i10) {
            case 5:
                return new ko.z[]{new ep.s(pVar, 32)};
            case 6:
                return new ko.z[]{new ep.w(pVar, 16)};
            default:
                return new ko.z[]{new fp.e()};
        }
    }

    @Override // io.odeeo.internal.x.g.a
    public boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
        return io.odeeo.internal.x.g.b(i10, i11, i12, i13, i14);
    }

    @Override // io.odeeo.internal.b.g.a
    /* renamed from: fromBundle, reason: collision with other method in class */
    public io.odeeo.internal.b.g mo3834fromBundle(Bundle bundle) {
        switch (this.f53818b) {
            case 7:
                return io.odeeo.internal.r0.b.a(bundle);
            case 8:
                return io.odeeo.internal.r0.m.a(bundle);
            case 21:
                return io.odeeo.internal.a0.k0.a(bundle);
            default:
                return io.odeeo.internal.a0.l0.a(bundle);
        }
    }

    @Override // ee.l
    public Constructor getConstructor() {
        switch (this.f53818b) {
            case 1:
                int[] iArr = ee.m.f54224p;
                if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(ee.p.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                int[] iArr2 = ee.m.f54224p;
                return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(ee.p.class).getConstructor(null);
        }
    }

    @Override // gn.p
    public SurfaceView getDebugPreviewSurfaceView(int i10, int i11) {
        return null;
    }

    @Override // sj.a
    public void handle(sj.c cVar) {
        cVar.get().getClass();
        throw new ClassCastException();
    }

    @Override // e6.i0
    public void notifyListener(g0 g0Var, c0 c0Var, boolean z10) {
        g0Var.onTransitionResume(c0Var);
    }

    @Override // com.google.android.exoplayer2.h
    public com.google.android.exoplayer2.i fromBundle(Bundle bundle) {
        ef.a aVar = new ef.a();
        CharSequence charSequence = bundle.getCharSequence(ef.b.f54285u);
        if (charSequence != null) {
            aVar.setText(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(ef.b.f54286v);
        if (alignment != null) {
            aVar.setTextAlignment(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(ef.b.f54287w);
        if (alignment2 != null) {
            aVar.setMultiRowAlignment(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(ef.b.f54288x);
        if (bitmap != null) {
            aVar.setBitmap(bitmap);
        }
        String str = ef.b.f54289y;
        if (bundle.containsKey(str)) {
            String str2 = ef.b.f54290z;
            if (bundle.containsKey(str2)) {
                aVar.setLine(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = ef.b.A;
        if (bundle.containsKey(str3)) {
            aVar.setLineAnchor(bundle.getInt(str3));
        }
        String str4 = ef.b.B;
        if (bundle.containsKey(str4)) {
            aVar.setPosition(bundle.getFloat(str4));
        }
        String str5 = ef.b.C;
        if (bundle.containsKey(str5)) {
            aVar.setPositionAnchor(bundle.getInt(str5));
        }
        String str6 = ef.b.E;
        if (bundle.containsKey(str6)) {
            String str7 = ef.b.D;
            if (bundle.containsKey(str7)) {
                aVar.setTextSize(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = ef.b.F;
        if (bundle.containsKey(str8)) {
            aVar.setSize(bundle.getFloat(str8));
        }
        String str9 = ef.b.G;
        if (bundle.containsKey(str9)) {
            aVar.setBitmapHeight(bundle.getFloat(str9));
        }
        String str10 = ef.b.H;
        if (bundle.containsKey(str10)) {
            aVar.setWindowColor(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(ef.b.I, false)) {
            aVar.clearWindowColor();
        }
        String str11 = ef.b.J;
        if (bundle.containsKey(str11)) {
            aVar.setVerticalType(bundle.getInt(str11));
        }
        String str12 = ef.b.K;
        if (bundle.containsKey(str12)) {
            aVar.setShearDegrees(bundle.getFloat(str12));
        }
        return aVar.build();
    }

    @Override // ee.u
    public ee.p[] createExtractors() {
        switch (this.f53818b) {
            case 13:
                return new ee.p[]{new fe.a()};
            default:
                return new ee.p[]{new he.c()};
        }
    }
}
