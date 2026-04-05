package yb;

import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import ub.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f94292a = new d();

    public boolean a() {
        return true;
    }

    public boolean includeBinary() {
        return a();
    }

    public boolean includeBoolean(boolean z10) {
        return a();
    }

    public boolean includeEmbeddedValue(Object obj) {
        return a();
    }

    public boolean includeEmptyArray(boolean z10) {
        return false;
    }

    public boolean includeEmptyObject(boolean z10) {
        return false;
    }

    public boolean includeNull() {
        return a();
    }

    public boolean includeNumber(int i10) {
        return a();
    }

    public boolean includeRawValue() {
        return a();
    }

    public boolean includeString(String str) {
        return a();
    }

    public boolean includeValue(u uVar) throws IOException {
        return a();
    }

    public String toString() {
        return this == f94292a ? "TokenFilter.INCLUDE_ALL" : super.toString();
    }

    public boolean includeNumber(long j10) {
        return a();
    }

    public boolean includeString(Reader reader, int i10) {
        return a();
    }

    public boolean includeNumber(float f10) {
        return a();
    }

    public boolean includeNumber(double d10) {
        return a();
    }

    public boolean includeNumber(BigDecimal bigDecimal) {
        return a();
    }

    public boolean includeNumber(BigInteger bigInteger) {
        return a();
    }

    public void filterFinishArray() {
    }

    public void filterFinishObject() {
    }

    public d filterStartArray() {
        return this;
    }

    public d filterStartObject() {
        return this;
    }

    public d includeElement(int i10) {
        return this;
    }

    public d includeProperty(String str) {
        return this;
    }

    public d includeRootValue(int i10) {
        return this;
    }
}
