package com.mbridge.msdk.foundation.cache;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: i, reason: collision with root package name */
    public static int f40356i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static int f40357j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static int f40358k = 3;

    /* renamed from: l, reason: collision with root package name */
    public static int f40359l = 2;

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f40360a;

    /* renamed from: b, reason: collision with root package name */
    private String f40361b;

    /* renamed from: c, reason: collision with root package name */
    private int f40362c = 21;

    /* renamed from: d, reason: collision with root package name */
    private int f40363d = f40357j;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<String> f40364e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private List<String> f40365f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private List<String> f40366g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private List<String> f40367h = new ArrayList();

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f40360a = copyOnWriteArrayList;
    }

    public String b() {
        List<String> list = this.f40367h;
        return list == null ? "" : list.toString();
    }

    public CopyOnWriteArrayList<CampaignEx> c() {
        return this.f40360a;
    }

    public String d() {
        List<String> list = this.f40366g;
        return list == null ? "" : list.toString();
    }

    public String e() {
        return this.f40361b;
    }

    public String f() {
        List<String> list = this.f40365f;
        return list == null ? "" : list.toString();
    }

    public int g() {
        return this.f40363d;
    }

    public String a() {
        ArrayList<String> arrayList = this.f40364e;
        return arrayList == null ? "" : arrayList.toString();
    }

    public void c(String str) {
        try {
            List<String> list = this.f40365f;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(String str) {
        try {
            List<String> list = this.f40366g;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void d(String str) {
        this.f40361b = str;
    }

    public void a(String str) {
        try {
            ArrayList<String> arrayList = this.f40364e;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(int i10) {
        this.f40363d = i10;
    }
}
