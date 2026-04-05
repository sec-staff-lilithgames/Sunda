package io.bidmachine;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d1 implements nm.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f60335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gr.i f60336b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TrackEventType f60337c;

    public d1(ArrayList arrayList, gr.i iVar, TrackEventType trackEventType) {
        this.f60335a = arrayList;
        this.f60336b = iVar;
        this.f60337c = trackEventType;
    }

    @Override // nm.b
    public void onSuccess(String str) {
    }

    @Override // nm.b
    public void onFail(pr.a aVar) {
        if (aVar == null) {
            aVar = pr.a.internal("Failed to track URL");
        }
        f1.a(this.f60335a, this.f60336b, this.f60337c.getActionValue(), aVar);
    }
}
