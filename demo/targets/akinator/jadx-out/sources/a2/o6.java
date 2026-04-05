package a2;

import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o6 implements p0.e0, androidx.lifecycle.v0 {

    /* renamed from: b, reason: collision with root package name */
    public final t f3745b;

    /* renamed from: c, reason: collision with root package name */
    public final p0.e0 f3746c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3747e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.lifecycle.k0 f3748f;

    /* renamed from: g, reason: collision with root package name */
    public kv.p f3749g;

    public o6(t owner, p0.e0 original) {
        kotlin.jvm.internal.e0.checkNotNullParameter(owner, "owner");
        kotlin.jvm.internal.e0.checkNotNullParameter(original, "original");
        this.f3745b = owner;
        this.f3746c = original;
        this.f3749g = f2.f3555a.m31getLambda1$ui_release();
    }

    @Override // p0.e0
    public void dispose() {
        if (!this.f3747e) {
            this.f3747e = true;
            this.f3745b.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.k0 k0Var = this.f3748f;
            if (k0Var != null) {
                k0Var.removeObserver(this);
            }
        }
        this.f3746c.dispose();
    }

    @Override // p0.e0
    public boolean getHasInvalidations() {
        return this.f3746c.getHasInvalidations();
    }

    public final p0.e0 getOriginal() {
        return this.f3746c;
    }

    public final t getOwner() {
        return this.f3745b;
    }

    @Override // p0.e0
    public boolean isDisposed() {
        return this.f3746c.isDisposed();
    }

    @Override // androidx.lifecycle.v0
    public void onStateChanged(androidx.lifecycle.b1 source, androidx.lifecycle.i0 event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        if (event == androidx.lifecycle.i0.ON_DESTROY) {
            dispose();
        } else {
            if (event != androidx.lifecycle.i0.ON_CREATE || this.f3747e) {
                return;
            }
            setContent(this.f3749g);
        }
    }

    @Override // p0.e0
    public void setContent(kv.p content) {
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        this.f3745b.setOnViewTreeOwnersAvailable(new n6(this, content));
    }
}
