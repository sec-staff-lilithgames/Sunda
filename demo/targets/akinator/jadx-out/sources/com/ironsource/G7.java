package com.ironsource;

import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface G7 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList<C5> f34456a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f34457b;

        /* renamed from: c, reason: collision with root package name */
        private int f34458c;

        /* renamed from: d, reason: collision with root package name */
        private Exception f34459d;

        public a(ArrayList<C5> arrayList) {
            this.f34457b = false;
            this.f34458c = -1;
            this.f34456a = arrayList;
        }

        public a a(Exception exc) {
            return new a(this.f34456a, this.f34458c, this.f34457b, exc);
        }

        public ArrayList<C5> b() {
            return this.f34456a;
        }

        public boolean c() {
            return this.f34457b;
        }

        public String toString() {
            return "EventSendResult{success=" + this.f34457b + ", responseCode=" + this.f34458c + ", exception=" + this.f34459d + AbstractJsonLexerKt.END_OBJ;
        }

        public a a(boolean z10) {
            return new a(this.f34456a, this.f34458c, z10, this.f34459d);
        }

        public a a(int i10) {
            return new a(this.f34456a, i10, this.f34457b, this.f34459d);
        }

        public String a() {
            if (this.f34457b) {
                return "";
            }
            return "rc=" + this.f34458c + ", ex=" + this.f34459d;
        }

        public a(ArrayList<C5> arrayList, int i10, boolean z10, Exception exc) {
            this.f34456a = arrayList;
            this.f34457b = z10;
            this.f34459d = exc;
            this.f34458c = i10;
        }
    }

    void a(a aVar);
}
