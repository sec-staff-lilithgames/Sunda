package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class p extends q implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f30066b;

    public p() {
        this.f30066b = new ArrayList();
    }

    public void add(Boolean bool) {
        this.f30066b.add(bool == null ? s.f30067b : new v(bool));
    }

    public void addAll(p pVar) {
        this.f30066b.addAll(pVar.f30066b);
    }

    public List<q> asList() {
        return new mk.s(this.f30066b);
    }

    public final q c() {
        ArrayList arrayList = this.f30066b;
        int size = arrayList.size();
        if (size == 1) {
            return (q) arrayList.get(0);
        }
        throw new IllegalStateException(a.b.e(size, "Array must have size 1, but has size "));
    }

    public boolean contains(q qVar) {
        return this.f30066b.contains(qVar);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof p) && ((p) obj).f30066b.equals(this.f30066b);
        }
        return true;
    }

    public q get(int i10) {
        return (q) this.f30066b.get(i10);
    }

    @Override // com.google.gson.q
    public BigDecimal getAsBigDecimal() {
        return c().getAsBigDecimal();
    }

    @Override // com.google.gson.q
    public BigInteger getAsBigInteger() {
        return c().getAsBigInteger();
    }

    @Override // com.google.gson.q
    public boolean getAsBoolean() {
        return c().getAsBoolean();
    }

    @Override // com.google.gson.q
    public byte getAsByte() {
        return c().getAsByte();
    }

    @Override // com.google.gson.q
    @Deprecated
    public char getAsCharacter() {
        return c().getAsCharacter();
    }

    @Override // com.google.gson.q
    public double getAsDouble() {
        return c().getAsDouble();
    }

    @Override // com.google.gson.q
    public float getAsFloat() {
        return c().getAsFloat();
    }

    @Override // com.google.gson.q
    public int getAsInt() {
        return c().getAsInt();
    }

    @Override // com.google.gson.q
    public long getAsLong() {
        return c().getAsLong();
    }

    @Override // com.google.gson.q
    public Number getAsNumber() {
        return c().getAsNumber();
    }

    @Override // com.google.gson.q
    public short getAsShort() {
        return c().getAsShort();
    }

    @Override // com.google.gson.q
    public String getAsString() {
        return c().getAsString();
    }

    public int hashCode() {
        return this.f30066b.hashCode();
    }

    public boolean isEmpty() {
        return this.f30066b.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<q> iterator() {
        return this.f30066b.iterator();
    }

    public boolean remove(q qVar) {
        return this.f30066b.remove(qVar);
    }

    public q set(int i10, q qVar) {
        if (qVar == null) {
            qVar = s.f30067b;
        }
        return (q) this.f30066b.set(i10, qVar);
    }

    public int size() {
        return this.f30066b.size();
    }

    public void add(Character ch2) {
        this.f30066b.add(ch2 == null ? s.f30067b : new v(ch2));
    }

    @Override // com.google.gson.q
    public p deepCopy() {
        ArrayList arrayList = this.f30066b;
        if (arrayList.isEmpty()) {
            return new p();
        }
        p pVar = new p(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pVar.add(((q) it.next()).deepCopy());
        }
        return pVar;
    }

    public q remove(int i10) {
        return (q) this.f30066b.remove(i10);
    }

    public p(int i10) {
        this.f30066b = new ArrayList(i10);
    }

    public void add(Number number) {
        this.f30066b.add(number == null ? s.f30067b : new v(number));
    }

    public void add(String str) {
        this.f30066b.add(str == null ? s.f30067b : new v(str));
    }

    public void add(q qVar) {
        if (qVar == null) {
            qVar = s.f30067b;
        }
        this.f30066b.add(qVar);
    }
}
