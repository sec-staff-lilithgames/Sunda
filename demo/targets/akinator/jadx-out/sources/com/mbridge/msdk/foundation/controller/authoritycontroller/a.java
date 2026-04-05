package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    protected int f40390a;

    /* renamed from: b, reason: collision with root package name */
    protected int f40391b;

    /* renamed from: c, reason: collision with root package name */
    protected int f40392c;

    /* renamed from: d, reason: collision with root package name */
    protected int f40393d;

    public void a(int i10) {
        this.f40390a = i10;
        this.f40391b = i10;
        this.f40392c = i10;
    }

    public void authDeviceIdStatus(int i10) {
        this.f40391b = i10;
    }

    public void authGenDataStatus(int i10) {
        this.f40390a = i10;
    }

    public void authOtherDataStatus(int i10) {
        this.f40393d = i10;
    }

    public void authSerialIdStatus(int i10) {
        this.f40392c = i10;
    }

    public int getAuthDeviceIdStatus() {
        return this.f40391b;
    }

    public int getAuthGenDataStatus() {
        return this.f40390a;
    }

    public int getAuthSerialIdStatus() {
        return this.f40392c;
    }

    public int getOtherDataStatus() {
        return this.f40393d;
    }

    public int getStatusByKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "authority_serial_id":
                    return this.f40392c;
                case "authority_device_id":
                    return this.f40391b;
                case "authority_general_data":
                    return this.f40390a;
                case "authority_other":
                    return this.f40393d;
            }
        }
        return 1;
    }
}
