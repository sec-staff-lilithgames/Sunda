package pe;

import android.animation.ValueAnimator;
import android.media.MediaCodecInfo;
import android.os.Bundle;
import android.view.View;
import bf.m1;
import com.google.android.exoplayer2.h;
import com.google.android.exoplayer2.util.n1;
import ee.p;
import ee.u;
import java.nio.file.Path;
import jd.j;
import ko.e0;
import ko.z;
import pf.c;
import pf.q;
import pq.i;
import qe.b0;
import qe.r;
import qf.t;
import qg.w;
import rp.c0;
import rp.i0;
import yq.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements u, h, j, e0, ir.d, b0, w, rf.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80953b;

    public /* synthetic */ a(int i10) {
        this.f80953b = i10;
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint b(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* bridge */ /* synthetic */ Class c() {
        return Path.class;
    }

    @Override // jd.j
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // rf.f
    public String buildCacheKey(t tVar) {
        String str = tVar.f82999h;
        return str != null ? str : tVar.f82992a.toString();
    }

    @Override // ee.u
    public p[] createExtractors() {
        return new p[]{new b()};
    }

    @Override // ir.d
    public void execute(Object obj) {
        switch (this.f80953b) {
            case 5:
                ((i) obj).a();
                break;
            case 6:
                ((o) obj).b();
                break;
            default:
                ((i) obj).a(false);
                break;
        }
    }

    @Override // com.google.android.exoplayer2.h
    public com.google.android.exoplayer2.i fromBundle(Bundle bundle) {
        switch (this.f80953b) {
            case 1:
                int i10 = bundle.getInt(c.d.f81058f, -1);
                int[] intArray = bundle.getIntArray(c.d.f81059g);
                int i11 = bundle.getInt(c.d.f81060h, -1);
                com.google.android.exoplayer2.util.a.checkArgument(i10 >= 0 && i11 >= 0);
                com.google.android.exoplayer2.util.a.checkNotNull(intArray);
                return new c.d(i10, intArray, i11);
            case 2:
                return new q((m1) m1.f9331j.fromBundle((Bundle) com.google.android.exoplayer2.util.a.checkNotNull(bundle.getBundle(q.f81134e))), rh.w.asList((int[]) com.google.android.exoplayer2.util.a.checkNotNull(bundle.getIntArray(q.f81135f))));
            default:
                return new sf.b(bundle.getInt(sf.b.f85607i, -1), bundle.getInt(sf.b.f85608j, -1), bundle.getInt(sf.b.f85609k, -1), bundle.getByteArray(sf.b.f85610l));
        }
    }

    @Override // qe.b0
    public int getScore(Object obj) {
        r rVar = (r) obj;
        switch (this.f80953b) {
            case 16:
                String str = rVar.f82850a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (n1.f28506a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                return rVar.f82850a.startsWith("OMX.google") ? 1 : 0;
        }
    }

    @Override // qg.w
    public void onAnimationUpdate(ValueAnimator valueAnimator, View view) {
        switch (this.f80953b) {
            case 18:
                view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                view.setScaleX(f10.floatValue());
                view.setScaleY(f10.floatValue());
                break;
            case 20:
                view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    @Override // ko.e0
    /* renamed from: createExtractors */
    public z[] mo3833createExtractors() {
        switch (this.f80953b) {
            case 4:
                return new z[]{new po.c()};
            case 22:
                return new z[]{new qo.b()};
            case 24:
                return new z[]{new rp.a()};
            case 25:
                return new z[]{new rp.c()};
            case 26:
                return new z[]{new rp.e()};
            case 27:
                return new z[]{new c0()};
            default:
                return new z[]{new i0(1, hp.q.f59124a)};
        }
    }
}
