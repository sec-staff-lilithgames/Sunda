package com.bytedance.adsdk.jd.jpo.jd;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jpo<K, A> {
    private final wqx<K> my;
    protected com.bytedance.adsdk.jd.qk.jd<A> wqx;
    final List<InterfaceC0058jpo> jpo = new ArrayList(1);

    /* renamed from: cm, reason: collision with root package name */
    private boolean f17296cm = false;

    /* renamed from: jd, reason: collision with root package name */
    protected float f17297jd = 0.0f;

    /* renamed from: jj, reason: collision with root package name */
    private A f17298jj = null;

    /* renamed from: qk, reason: collision with root package name */
    private float f17299qk = -1.0f;
    private float xyk = -1.0f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class cm<T> implements wqx<T> {
        private final List<? extends com.bytedance.adsdk.jd.qk.jpo<T>> jpo;
        private com.bytedance.adsdk.jd.qk.jpo<T> wqx = null;

        /* renamed from: cm, reason: collision with root package name */
        private float f17300cm = -1.0f;

        /* renamed from: jd, reason: collision with root package name */
        private com.bytedance.adsdk.jd.qk.jpo<T> f17301jd = wqx(0.0f);

        public cm(List<? extends com.bytedance.adsdk.jd.qk.jpo<T>> list) {
            this.jpo = list;
        }

        private com.bytedance.adsdk.jd.qk.jpo<T> wqx(float f10) {
            com.bytedance.adsdk.jd.qk.jpo<T> jpoVar = (com.bytedance.adsdk.jd.qk.jpo) o2.g(1, this.jpo);
            if (f10 >= jpoVar.wqx()) {
                return jpoVar;
            }
            for (int size = this.jpo.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.jd.qk.jpo<T> jpoVar2 = this.jpo.get(size);
                if (this.f17301jd != jpoVar2 && jpoVar2.jpo(f10)) {
                    return jpoVar2;
                }
            }
            return this.jpo.get(0);
        }

        @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.wqx
        public float cm() {
            return ((com.bytedance.adsdk.jd.qk.jpo) o2.g(1, this.jpo)).cm();
        }

        @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.wqx
        public com.bytedance.adsdk.jd.qk.jpo<T> jd() {
            return this.f17301jd;
        }

        @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.wqx
        public boolean jpo() {
            return false;
        }

        @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.wqx
        public boolean jd(float f10) {
            com.bytedance.adsdk.jd.qk.jpo<T> jpoVar = this.wqx;
            com.bytedance.adsdk.jd.qk.jpo<T> jpoVar2 = this.f17301jd;
            if (jpoVar == jpoVar2 && this.f17300cm == f10) {
                return true;
            }
            this.wqx = jpoVar2;
            this.f17300cm = f10;
            return false;
        }

        @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.wqx
        public boolean jpo(float f10) {
            if (this.f17301jd.jpo(f10)) {
                return !this.f17301jd.my();
            }
            this.f17301jd = wqx(f10);
            return true;
        }

        @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.wqx
        public float wqx() {
            return this.jpo.get(0).wqx();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class jd<T> implements wqx<T> {
        private jd() {
        }

        @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.wqx
        public float cm() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.wqx
        public com.bytedance.adsdk.jd.qk.jpo<T> jd() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.wqx
        public boolean jpo() {
            return true;
        }

        @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.wqx
        public float wqx() {
            return 0.0f;
        }

        @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.wqx
        public boolean jd(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.wqx
        public boolean jpo(float f10) {
            return false;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.jd.jpo.jd.jpo$jpo, reason: collision with other inner class name */
    public interface InterfaceC0058jpo {
        void jpo();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class my<T> implements wqx<T> {

        /* renamed from: jd, reason: collision with root package name */
        private float f17302jd = -1.0f;
        private final com.bytedance.adsdk.jd.qk.jpo<T> jpo;

        public my(List<? extends com.bytedance.adsdk.jd.qk.jpo<T>> list) {
            this.jpo = list.get(0);
        }

        @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.wqx
        public float cm() {
            return this.jpo.cm();
        }

        @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.wqx
        public com.bytedance.adsdk.jd.qk.jpo<T> jd() {
            return this.jpo;
        }

        @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.wqx
        public boolean jpo() {
            return false;
        }

        @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.wqx
        public float wqx() {
            return this.jpo.wqx();
        }

        @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.wqx
        public boolean jd(float f10) {
            if (this.f17302jd == f10) {
                return true;
            }
            this.f17302jd = f10;
            return false;
        }

        @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.wqx
        public boolean jpo(float f10) {
            return !this.jpo.my();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface wqx<T> {
        float cm();

        com.bytedance.adsdk.jd.qk.jpo<T> jd();

        boolean jd(float f10);

        boolean jpo();

        boolean jpo(float f10);

        float wqx();
    }

    public jpo(List<? extends com.bytedance.adsdk.jd.qk.jpo<K>> list) {
        this.my = jpo(list);
    }

    private float zz() {
        if (this.f17299qk == -1.0f) {
            this.f17299qk = this.my.wqx();
        }
        return this.f17299qk;
    }

    public float cm() {
        if (this.f17296cm) {
            return 0.0f;
        }
        com.bytedance.adsdk.jd.qk.jpo<K> jpoVarWqx = wqx();
        if (jpoVarWqx.my()) {
            return 0.0f;
        }
        return (this.f17297jd - jpoVarWqx.wqx()) / (jpoVarWqx.cm() - jpoVarWqx.wqx());
    }

    public void jd() {
        for (int i10 = 0; i10 < this.jpo.size(); i10++) {
            this.jpo.get(i10).jpo();
        }
    }

    public float jj() {
        if (this.xyk == -1.0f) {
            this.xyk = this.my.cm();
        }
        return this.xyk;
    }

    public abstract A jpo(com.bytedance.adsdk.jd.qk.jpo<K> jpoVar, float f10);

    public void jpo() {
        this.f17296cm = true;
    }

    public float my() {
        com.bytedance.adsdk.jd.qk.jpo<K> jpoVarWqx = wqx();
        if (jpoVarWqx == null || jpoVarWqx.my()) {
            return 0.0f;
        }
        return jpoVarWqx.wqx.getInterpolation(cm());
    }

    public A qk() {
        float fCm = cm();
        if (this.wqx == null && this.my.jd(fCm)) {
            return this.f17298jj;
        }
        com.bytedance.adsdk.jd.qk.jpo<K> jpoVarWqx = wqx();
        Interpolator interpolator = jpoVarWqx.f17432cm;
        A aJpo = (interpolator == null || jpoVarWqx.my == null) ? jpo(jpoVarWqx, my()) : jpo(jpoVarWqx, fCm, interpolator.getInterpolation(fCm), jpoVarWqx.my.getInterpolation(fCm));
        this.f17298jj = aJpo;
        return aJpo;
    }

    public com.bytedance.adsdk.jd.qk.jpo<K> wqx() {
        com.bytedance.adsdk.jd.my.jpo("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.jd.qk.jpo<K> jpoVarJd = this.my.jd();
        com.bytedance.adsdk.jd.my.jd("BaseKeyframeAnimation#getCurrentKeyframe");
        return jpoVarJd;
    }

    public float xyk() {
        return this.f17297jd;
    }

    public void jpo(InterfaceC0058jpo interfaceC0058jpo) {
        this.jpo.add(interfaceC0058jpo);
    }

    public void jpo(float f10) {
        if (this.my.jpo()) {
            return;
        }
        if (f10 < zz()) {
            f10 = zz();
        } else if (f10 > jj()) {
            f10 = jj();
        }
        if (f10 == this.f17297jd) {
            return;
        }
        this.f17297jd = f10;
        if (this.my.jpo(f10)) {
            jd();
        }
    }

    public A jpo(com.bytedance.adsdk.jd.qk.jpo<K> jpoVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> wqx<T> jpo(List<? extends com.bytedance.adsdk.jd.qk.jpo<T>> list) {
        if (list.isEmpty()) {
            return new jd();
        }
        if (list.size() == 1) {
            return new my(list);
        }
        return new cm(list);
    }
}
