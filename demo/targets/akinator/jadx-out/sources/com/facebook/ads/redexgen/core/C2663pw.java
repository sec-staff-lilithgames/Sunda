package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.pw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2663pw<ModelType, StateType> {
    public final ModelType A03;
    public final StateType A04;
    public final String A05;
    public final String A06;
    public List<ViewpointAction<ModelType, StateType>> A01 = null;
    public C2661pu A00 = C2661pu.A0B;
    public boolean A02 = false;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pw != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public C2663pw(ModelType model, StateType state, String str) {
        this.A03 = model;
        this.A04 = state;
        this.A06 = str;
        this.A05 = str;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pw != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.py != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final C2663pw<ModelType, StateType> A06(ViewpointAction<ModelType, StateType> viewpointAction) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        this.A01.add(viewpointAction);
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pw != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final C2661pu<ModelType, StateType> A07() {
        return new C2661pu<>(this);
    }
}
