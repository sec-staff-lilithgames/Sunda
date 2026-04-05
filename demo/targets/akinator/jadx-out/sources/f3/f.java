package f3;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f extends a3.m {
    public static f makeSpline(String str) {
        if (str.startsWith(com.ironsource.mediationsdk.l.f37559f)) {
            return new d();
        }
        switch (str) {
            case "rotationX":
                return new i();
            case "rotationY":
                return new j();
            case "translationX":
                return new m();
            case "translationY":
                return new n();
            case "translationZ":
                return new o();
            case "progress":
                g gVar = new g();
                gVar.f55335h = false;
                return gVar;
            case "scaleX":
                return new k();
            case "scaleY":
                return new l();
            case "waveVariesBy":
                return new c();
            case "rotation":
                return new h();
            case "elevation":
                return new e();
            case "transitionPathRotate":
                return new a();
            case "alpha":
                return new c();
            case "waveOffset":
                return new c();
            default:
                return null;
        }
    }

    public abstract void setProperty(View view, float f10);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends f {
        public void setPathRotate(View view, float f10, double d10, double d11) {
            view.setRotation(get(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }

        @Override // f3.f
        public void setProperty(View view, float f10) {
        }
    }
}
