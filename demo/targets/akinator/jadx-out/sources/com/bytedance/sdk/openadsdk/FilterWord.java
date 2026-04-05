package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class FilterWord {

    /* renamed from: cm, reason: collision with root package name */
    private List<FilterWord> f19135cm;

    /* renamed from: jd, reason: collision with root package name */
    private String f19136jd;
    private String jpo;
    private boolean wqx;

    public FilterWord(String str, String str2) {
        this.jpo = str;
        this.f19136jd = str2;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.f19135cm == null) {
            this.f19135cm = new ArrayList();
        }
        this.f19135cm.add(filterWord);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FilterWord)) {
            return false;
        }
        FilterWord filterWord = (FilterWord) obj;
        return filterWord.getId().equals(getId()) && filterWord.getName().equals(getName());
    }

    public String getId() {
        return this.jpo;
    }

    public boolean getIsSelected() {
        return this.wqx;
    }

    public String getName() {
        return this.f19136jd;
    }

    public List<FilterWord> getOptions() {
        return this.f19135cm;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.f19135cm;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.jpo) || TextUtils.isEmpty(this.f19136jd)) ? false : true;
    }

    public void setId(String str) {
        this.jpo = str;
    }

    public void setIsSelected(boolean z10) {
        this.wqx = z10;
    }

    public void setName(String str) {
        this.f19136jd = str;
    }

    public FilterWord() {
    }
}
