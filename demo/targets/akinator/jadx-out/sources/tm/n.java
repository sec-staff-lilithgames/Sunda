package tm;

import j1.o2;
import java.util.Date;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f87094a;

    /* renamed from: b, reason: collision with root package name */
    public final Date f87095b;

    /* renamed from: c, reason: collision with root package name */
    public String f87096c;

    /* renamed from: d, reason: collision with root package name */
    public String f87097d;

    /* renamed from: e, reason: collision with root package name */
    public Date f87098e;

    /* renamed from: f, reason: collision with root package name */
    public String f87099f;

    /* renamed from: g, reason: collision with root package name */
    public String f87100g;

    /* renamed from: h, reason: collision with root package name */
    public String f87101h;

    public n(String str, Date date) {
        this.f87094a = str;
        this.f87095b = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Objects.equals(this.f87094a, nVar.f87094a) && Objects.equals(this.f87095b, nVar.f87095b) && Objects.equals(this.f87096c, nVar.f87096c) && Objects.equals(this.f87097d, nVar.f87097d) && Objects.equals(this.f87098e, nVar.f87098e) && Objects.equals(this.f87099f, nVar.f87099f) && Objects.equals(this.f87100g, nVar.f87100g) && Objects.equals(this.f87101h, nVar.f87101h);
    }

    public String getDescription() {
        return this.f87094a;
    }

    public Date getEnd() {
        return this.f87098e;
    }

    public String getLocation() {
        return this.f87096c;
    }

    public String getRecurrence() {
        return this.f87101h;
    }

    public Date getStart() {
        return this.f87095b;
    }

    public String getStatus() {
        return this.f87099f;
    }

    public String getSummary() {
        return this.f87097d;
    }

    public String getTransparency() {
        return this.f87100g;
    }

    public int hashCode() {
        return Objects.hash(this.f87094a, this.f87095b, this.f87096c, this.f87097d, this.f87098e, this.f87099f, this.f87100g, this.f87101h);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MraidCalendarEvent{description='");
        sb2.append(this.f87094a);
        sb2.append("', start=");
        sb2.append(this.f87095b);
        sb2.append(", location='");
        sb2.append(this.f87096c);
        sb2.append("', summary='");
        sb2.append(this.f87097d);
        sb2.append("', end=");
        sb2.append(this.f87098e);
        sb2.append(", status='");
        sb2.append(this.f87099f);
        sb2.append("', transparency='");
        sb2.append(this.f87100g);
        sb2.append("', recurrence='");
        return o2.o(sb2, this.f87101h, "'}");
    }
}
