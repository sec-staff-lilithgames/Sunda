package com.facebook.ads;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class RewardData implements Serializable {
    private static final long serialVersionUID = -6264212909606201882L;
    private String mCurrency;
    private int mQuantity;
    private String mUserID;

    public RewardData(String str, String str2) {
        this(str, str2, 0);
    }

    public String getCurrency() {
        return this.mCurrency;
    }

    public int getQuantity() {
        return this.mQuantity;
    }

    public String getUserID() {
        return this.mUserID;
    }

    public RewardData(String str, String str2, int i10) {
        this.mUserID = str;
        this.mCurrency = str2;
        this.mQuantity = i10;
    }
}
