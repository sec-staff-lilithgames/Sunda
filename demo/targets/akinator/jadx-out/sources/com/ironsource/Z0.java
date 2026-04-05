package com.ironsource;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes7.dex */
public class Z0 implements Parcelable {
    public static final Parcelable.Creator<Z0> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f35820a;

    /* renamed from: b, reason: collision with root package name */
    private String f35821b;

    /* renamed from: c, reason: collision with root package name */
    private String f35822c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f35823d;

    /* renamed from: e, reason: collision with root package name */
    private int f35824e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<String> f35825f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<String> f35826g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<String> f35827h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList<String> f35828i;

    /* renamed from: j, reason: collision with root package name */
    private String f35829j;

    /* renamed from: k, reason: collision with root package name */
    private String f35830k;

    /* renamed from: l, reason: collision with root package name */
    private Map<String, String> f35831l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Parcelable.Creator<Z0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Z0 createFromParcel(Parcel parcel) {
            return new Z0(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Z0[] newArray(int i10) {
            return new Z0[i10];
        }
    }

    public /* synthetic */ Z0(Parcel parcel, int i10) {
        this(parcel);
    }

    private void i() {
        this.f35823d = false;
        this.f35824e = -1;
        this.f35825f = new ArrayList<>();
        this.f35826g = new ArrayList<>();
        this.f35827h = new ArrayList<>();
        this.f35828i = new ArrayList<>();
        this.f35830k = "";
        this.f35829j = "";
        this.f35831l = new HashMap();
    }

    public void a(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z10) {
            this.f35826g.remove(str);
        } else if (this.f35826g.indexOf(str) == -1) {
            this.f35826g.add(str);
        }
    }

    public boolean b(String str) {
        return !TextUtils.isEmpty(str) && this.f35826g.indexOf(str) > -1;
    }

    public boolean c(String str) {
        return !TextUtils.isEmpty(str) && this.f35828i.indexOf(str) > -1;
    }

    public String d() {
        return this.f35829j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<String, String> e() {
        return this.f35831l;
    }

    public String f() {
        return this.f35830k;
    }

    public void g(String str) {
        this.f35829j = str;
    }

    public void h(String str) {
        this.f35830k = str;
    }

    public boolean j() {
        return this.f35823d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append("shouldRestore:");
            sb2.append(this.f35823d);
            sb2.append(", ");
            sb2.append("displayedProduct:");
            sb2.append(this.f35824e);
            sb2.append(", ");
            sb2.append("ISReportInit:");
            sb2.append(this.f35825f);
            sb2.append(", ");
            sb2.append("ISInitSuccess:");
            sb2.append(this.f35826g);
            sb2.append(", ");
            sb2.append("ISAppKey");
            sb2.append(this.f35829j);
            sb2.append(", ");
            sb2.append("ISUserId");
            sb2.append(this.f35830k);
            sb2.append(", ");
            sb2.append("ISExtraParams");
            sb2.append(this.f35831l);
            sb2.append(", ");
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        try {
            parcel.writeByte(this.f35823d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f35824e);
            parcel.writeString(this.f35820a);
            parcel.writeString(this.f35821b);
            parcel.writeString(this.f35822c);
            parcel.writeString(this.f35829j);
            parcel.writeString(this.f35830k);
            parcel.writeString(new JSONObject(this.f35831l).toString());
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
        }
    }

    public Z0() {
        i();
    }

    public boolean d(String str) {
        return !TextUtils.isEmpty(str) && this.f35825f.indexOf(str) > -1;
    }

    public boolean e(String str) {
        return !TextUtils.isEmpty(str) && this.f35827h.indexOf(str) > -1;
    }

    public void f(String str) {
        this.f35822c = str;
    }

    public String g() {
        return this.f35820a;
    }

    public String h() {
        return this.f35821b;
    }

    public void j(String str) {
        this.f35821b = str;
    }

    public String b() {
        return this.f35822c;
    }

    public int c() {
        return this.f35824e;
    }

    private Z0(Parcel parcel) {
        i();
        try {
            this.f35823d = parcel.readByte() != 0;
            this.f35824e = parcel.readInt();
            this.f35820a = parcel.readString();
            this.f35821b = parcel.readString();
            this.f35822c = parcel.readString();
            this.f35829j = parcel.readString();
            this.f35830k = parcel.readString();
            this.f35831l = a(parcel.readString());
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            i();
        }
    }

    public void b(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            if (this.f35828i.indexOf(str) == -1) {
                this.f35828i.add(str);
                return;
            }
            return;
        }
        this.f35828i.remove(str);
    }

    public void c(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            if (this.f35825f.indexOf(str) == -1) {
                this.f35825f.add(str);
                return;
            }
            return;
        }
        this.f35825f.remove(str);
    }

    public void d(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            if (this.f35827h.indexOf(str) == -1) {
                this.f35827h.add(str);
                return;
            }
            return;
        }
        this.f35827h.remove(str);
    }

    public void a(Map<String, String> map) {
        this.f35831l = map;
    }

    public void a(boolean z10) {
        this.f35823d = z10;
    }

    public void a(int i10) {
        this.f35824e = i10;
    }

    public void a() {
        this.f35824e = -1;
    }

    private Map<String, String> a(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
        return map;
    }

    public void i(String str) {
        this.f35820a = str;
    }
}
