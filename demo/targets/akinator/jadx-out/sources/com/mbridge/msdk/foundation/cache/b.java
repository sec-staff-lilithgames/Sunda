package com.mbridge.msdk.foundation.cache;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.j0;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f40346a;

    /* renamed from: b, reason: collision with root package name */
    private double f40347b;

    /* renamed from: c, reason: collision with root package name */
    private String f40348c;

    /* renamed from: d, reason: collision with root package name */
    private String f40349d;

    /* renamed from: e, reason: collision with root package name */
    private int f40350e;

    /* renamed from: f, reason: collision with root package name */
    private long f40351f;

    /* renamed from: g, reason: collision with root package name */
    private int f40352g;

    /* renamed from: h, reason: collision with root package name */
    private long f40353h;

    /* renamed from: i, reason: collision with root package name */
    private String f40354i;

    /* renamed from: j, reason: collision with root package name */
    private long f40355j;

    public void a(long j10) {
        this.f40355j = j10;
    }

    public double b() {
        return this.f40347b;
    }

    public long c() {
        return this.f40355j;
    }

    public String d() {
        return this.f40348c;
    }

    public String e() {
        return this.f40349d;
    }

    public int f() {
        return this.f40350e;
    }

    public int g() {
        return this.f40352g;
    }

    public long h() {
        return this.f40353h;
    }

    public CopyOnWriteArrayList<CampaignEx> a() {
        return this.f40346a;
    }

    public void b(String str) {
        this.f40348c = str;
    }

    public void c(String str) {
        this.f40349d = str;
    }

    public void d(String str) {
        this.f40354i = str;
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f40346a = copyOnWriteArrayList;
    }

    public void b(int i10) {
        this.f40352g = i10;
    }

    public void c(long j10) {
        this.f40353h = j10;
    }

    public void a(String str) throws NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strA = j0.a(str);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        try {
            double d10 = Double.parseDouble(strA);
            if (d10 <= 0.0d) {
                return;
            }
            this.f40347b = d10;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(long j10) {
        this.f40351f = j10;
    }

    public void a(int i10) {
        this.f40350e = i10;
    }
}
