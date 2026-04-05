package zd;

import com.google.android.exoplayer2.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class h implements com.google.android.exoplayer2.util.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f97823c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0 f97824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ce.k f97825f;

    public /* synthetic */ h(b bVar, z0 z0Var, ce.k kVar, int i10) {
        this.f97822b = i10;
        this.f97823c = bVar;
        this.f97824e = z0Var;
        this.f97825f = kVar;
    }

    @Override // com.google.android.exoplayer2.util.a0
    public final void invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f97822b) {
            case 0:
                z zVar = (z) dVar;
                b bVar = this.f97823c;
                z0 z0Var = this.f97824e;
                zVar.onAudioInputFormatChanged(bVar, z0Var);
                zVar.onAudioInputFormatChanged(bVar, z0Var, this.f97825f);
                break;
            default:
                z zVar2 = (z) dVar;
                b bVar2 = this.f97823c;
                z0 z0Var2 = this.f97824e;
                zVar2.onVideoInputFormatChanged(bVar2, z0Var2);
                zVar2.onVideoInputFormatChanged(bVar2, z0Var2, this.f97825f);
                break;
        }
    }
}
