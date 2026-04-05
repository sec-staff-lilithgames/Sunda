package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class RewardPlus implements Serializable, NoProGuard {
    public static final String AMOUNT = "amount";
    public static final String AMOUNT_MAX = "amount_max";
    public static final String CALLBACK_RULE = "callback_rule";
    public static final String CURRENCY_ID = "currency_id";
    public static final String ICON = "icon";
    public static final String NAME = "name";
    public static final String VIRTUAL_CURRENCY = "virtual_currency";
    private int amount = 1;
    private int amountMax = 0;
    private int callbackRule = 1;
    private int currencyId = 1;
    private String icon = "";
    private String name = "Virtual Item";
    private String virtualCurrency = "";

    public static RewardPlus parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        RewardPlus rewardPlus = new RewardPlus();
        rewardPlus.setAmountMax(jSONObject.optInt(AMOUNT_MAX, 0));
        rewardPlus.setCallbackRule(jSONObject.optInt(CALLBACK_RULE, 1));
        rewardPlus.setVirtualCurrency(jSONObject.optString(VIRTUAL_CURRENCY, ""));
        rewardPlus.setIcon(jSONObject.optString("icon", ""));
        rewardPlus.setCurrencyId(jSONObject.optInt(CURRENCY_ID, 1));
        if (jSONObject.has("amount")) {
            rewardPlus.setAmount(jSONObject.optInt("amount", 1));
        }
        if (jSONObject.has("name")) {
            rewardPlus.setName(jSONObject.optString("name", "Virtual Item"));
        }
        return rewardPlus;
    }

    public static RewardPlus parseByString(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return parse(new JSONObject(str));
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public int getAmount() {
        return this.amount;
    }

    public int getAmountMax() {
        return this.amountMax;
    }

    public int getCallbackRule() {
        return this.callbackRule;
    }

    public int getCurrencyId() {
        return this.currencyId;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public String getVirtualCurrency() {
        return this.virtualCurrency;
    }

    public void setAmount(int i10) {
        this.amount = i10;
    }

    public void setAmountMax(int i10) {
        this.amountMax = i10;
    }

    public void setCallbackRule(int i10) {
        this.callbackRule = i10;
    }

    public void setCurrencyId(int i10) {
        this.currencyId = i10;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setVirtualCurrency(String str) {
        this.virtualCurrency = str;
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AMOUNT_MAX, this.amountMax);
            jSONObject.put(CALLBACK_RULE, this.callbackRule);
            jSONObject.put(VIRTUAL_CURRENCY, this.virtualCurrency);
            jSONObject.put("amount", this.amount);
            jSONObject.put("icon", this.icon);
            jSONObject.put(CURRENCY_ID, this.currencyId);
            jSONObject.put("name", this.name);
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }
}
