package androidx.lifecycle;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6724b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f6725c;

    public /* synthetic */ w0(ProducerScope producerScope, int i10) {
        this.f6724b = i10;
        this.f6725c = producerScope;
    }

    @Override // androidx.lifecycle.v0
    public final void onStateChanged(b1 b1Var, i0 i0Var) {
        switch (this.f6724b) {
            case 0:
                ProducerScope producerScope = this.f6725c;
                producerScope.mo5139trySendJP2dKIU(i0Var);
                if (i0Var == i0.ON_DESTROY) {
                    SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
                    break;
                }
                break;
            default:
                l.f.a(this.f6725c, b1Var, i0Var);
                break;
        }
    }
}
