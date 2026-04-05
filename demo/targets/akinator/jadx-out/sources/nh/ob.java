package nh;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class ob implements r8 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f76532a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f76533b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f76534c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f76535d;

    public ob(AbstractMap abstractMap, AbstractMap abstractMap2, AbstractMap abstractMap3, AbstractMap abstractMap4) {
        this.f76532a = ec.a(abstractMap);
        this.f76533b = ec.a(abstractMap2);
        this.f76534c = ec.a(abstractMap3);
        this.f76535d = ec.a(abstractMap4);
    }

    @Override // nh.r8
    public boolean areEqual() {
        return this.f76532a.isEmpty() && this.f76533b.isEmpty() && this.f76535d.isEmpty();
    }

    @Override // nh.r8
    public Map<Object, q8> entriesDiffering() {
        return this.f76535d;
    }

    @Override // nh.r8
    public Map<Object, Object> entriesInCommon() {
        return this.f76534c;
    }

    @Override // nh.r8
    public Map<Object, Object> entriesOnlyOnLeft() {
        return this.f76532a;
    }

    @Override // nh.r8
    public Map<Object, Object> entriesOnlyOnRight() {
        return this.f76533b;
    }

    @Override // nh.r8
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r8) {
            r8 r8Var = (r8) obj;
            if (entriesOnlyOnLeft().equals(r8Var.entriesOnlyOnLeft()) && entriesOnlyOnRight().equals(r8Var.entriesOnlyOnRight()) && entriesInCommon().equals(r8Var.entriesInCommon()) && entriesDiffering().equals(r8Var.entriesDiffering())) {
                return true;
            }
        }
        return false;
    }

    @Override // nh.r8
    public int hashCode() {
        return Objects.hash(entriesOnlyOnLeft(), entriesOnlyOnRight(), entriesInCommon(), entriesDiffering());
    }

    public String toString() {
        if (areEqual()) {
            return "equal";
        }
        StringBuilder sb2 = new StringBuilder("not equal");
        Map map = this.f76532a;
        if (!map.isEmpty()) {
            sb2.append(": only on left=");
            sb2.append(map);
        }
        Map map2 = this.f76533b;
        if (!map2.isEmpty()) {
            sb2.append(": only on right=");
            sb2.append(map2);
        }
        Map map3 = this.f76535d;
        if (!map3.isEmpty()) {
            sb2.append(": value differences=");
            sb2.append(map3);
        }
        return sb2.toString();
    }
}
