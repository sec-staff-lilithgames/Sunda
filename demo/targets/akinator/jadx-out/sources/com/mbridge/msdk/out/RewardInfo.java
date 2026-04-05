package com.mbridge.msdk.out;

import com.mbridge.msdk.system.NoProGuard;
import e3.g;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class RewardInfo implements Serializable, NoProGuard {
    private boolean isCompleteView;
    private int rewardAlertStatus;
    private String rewardAmount;
    private String rewardName;

    public RewardInfo(boolean z10, int i10) {
        this.isCompleteView = z10;
        this.rewardAlertStatus = i10;
    }

    public int getRewardAlertStatus() {
        return this.rewardAlertStatus;
    }

    public String getRewardAmount() {
        return this.rewardAmount;
    }

    public String getRewardName() {
        return this.rewardName;
    }

    public boolean isCompleteView() {
        return this.isCompleteView;
    }

    public void setCompleteView(boolean z10) {
        this.isCompleteView = z10;
    }

    public void setRewardAlertStatus(int i10) {
        this.rewardAlertStatus = i10;
    }

    public void setRewardAmount(String str) {
        this.rewardAmount = str;
    }

    public void setRewardName(String str) {
        this.rewardName = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RewardInfo{isCompleteView=");
        sb2.append(this.isCompleteView);
        sb2.append(", rewardName='");
        sb2.append(this.rewardName);
        sb2.append("', rewardAmount='");
        sb2.append(this.rewardAmount);
        sb2.append("', rewardAlertStatus=");
        return g.m(sb2, this.rewardAlertStatus, AbstractJsonLexerKt.END_OBJ);
    }

    public RewardInfo(boolean z10, String str, String str2) {
        this.isCompleteView = z10;
        this.rewardName = str;
        this.rewardAmount = str2;
    }

    public RewardInfo(boolean z10, String str, String str2, int i10) {
        this.isCompleteView = z10;
        this.rewardName = str;
        this.rewardAmount = str2;
        this.rewardAlertStatus = i10;
    }
}
