package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import com.fyber.inneractive.sdk.activities.FyberReportAdActivity;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.ui.FyberAdIdentifierFactory;
import com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal;
import com.fyber.inneractive.sdk.ui.FyberAdIdentifierRemote;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements IFyberAdIdentifier.ClickListener, h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23642a;

    /* renamed from: b, reason: collision with root package name */
    public final InneractiveAdRequest f23643b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.e f23644c;

    /* renamed from: d, reason: collision with root package name */
    public final IFyberAdIdentifier f23645d;

    public g(Context context, boolean z10, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f23642a = context;
        this.f23643b = inneractiveAdRequest;
        this.f23644c = eVar;
        new FyberAdIdentifierFactory();
        IFyberAdIdentifier fyberAdIdentifierRemote = z10 ? new FyberAdIdentifierRemote(rVar) : new FyberAdIdentifierLocal(rVar);
        this.f23645d = fyberAdIdentifierRemote;
        fyberAdIdentifierRemote.f26723a = this;
    }

    @Override // com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.ClickListener
    public final void a() {
        Long demandId;
        String demandSource;
        com.fyber.inneractive.sdk.response.e eVar = this.f23644c;
        String str = null;
        if (eVar != null) {
            ImpressionData impressionData = eVar.f26648t;
            String advertiserDomain = impressionData != null ? impressionData.getAdvertiserDomain() : null;
            ImpressionData impressionData2 = this.f23644c.f26648t;
            demandSource = impressionData2 != null ? impressionData2.getDemandSource() : null;
            ImpressionData impressionData3 = this.f23644c.f26648t;
            str = advertiserDomain;
            demandId = impressionData3 != null ? impressionData3.getDemandId() : null;
        } else {
            demandId = null;
            demandSource = null;
        }
        FyberReportAdActivity.start(this.f23642a, this, str, demandSource, demandId);
    }
}
