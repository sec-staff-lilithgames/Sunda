package com.ironsource;

import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.eb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3198eb implements InterfaceC3124a9 {

    /* renamed from: a, reason: collision with root package name */
    private final LevelPlayImpressionDataListener f36610a;

    public C3198eb(LevelPlayImpressionDataListener listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        this.f36610a = listener;
    }

    public final LevelPlayImpressionDataListener a() {
        return this.f36610a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3198eb) {
            return kotlin.jvm.internal.e0.areEqual(this.f36610a, ((C3198eb) obj).f36610a);
        }
        return false;
    }

    public int hashCode() {
        return this.f36610a.hashCode();
    }

    @Override // com.ironsource.InterfaceC3124a9
    public void a(Y8 impressionData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(impressionData, "impressionData");
        if (impressionData.d() != null) {
            JSONObject jSONObjectD = impressionData.d();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectD, "impressionData.allData");
            this.f36610a.onImpressionSuccess(new LevelPlayImpressionData(jSONObjectD));
        }
    }
}
