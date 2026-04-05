package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ea extends Re {

    /* renamed from: d, reason: collision with root package name */
    public final C2793h f31751d;

    /* renamed from: e, reason: collision with root package name */
    public final A0 f31752e;

    /* renamed from: f, reason: collision with root package name */
    public InMobiAdRequestStatus f31753f;

    /* renamed from: g, reason: collision with root package name */
    public final F5 f31754g;

    /* renamed from: h, reason: collision with root package name */
    public final WeakReference f31755h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ea(U0 adUnit, C2793h ad2, A0 adSet, InMobiAdRequestStatus status, F5 f52) {
        super(adUnit, (byte) 1);
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(adSet, "adSet");
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        this.f31751d = ad2;
        this.f31752e = adSet;
        this.f31753f = status;
        this.f31754g = f52;
        this.f31755h = new WeakReference(adUnit);
    }

    @Override // com.inmobi.media.Re
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        a(((Boolean) obj).booleanValue());
    }

    @Override // com.inmobi.media.I1
    public final void c() {
        super.c();
        this.f31753f = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY);
        a(false);
    }

    public final void a(boolean z10) {
        F5 f52 = this.f31754g;
        if (f52 != null) {
            ((G5) f52).c("ParseAdResponseWorker", j1.o2.n("onComplete result - ", z10));
        }
        U0 u02 = (U0) this.f31755h.get();
        if (u02 != null) {
            F5 f53 = this.f31754g;
            if (f53 != null) {
                ((G5) f53).c("ParseAdResponseWorker", "updating vitals in logger");
            }
            u02.a(z10, this.f31753f);
            return;
        }
        F5 f54 = this.f31754g;
        if (f54 != null) {
            ((G5) f54).b("ParseAdResponseWorker", "onComplete - adunit is null");
        }
    }

    @Override // com.inmobi.media.I1
    public final void a() {
        F5 f52 = this.f31754g;
        if (f52 != null) {
            ((G5) f52).c("ParseAdResponseWorker", "execute task");
        }
        U0 u02 = (U0) this.f31755h.get();
        if (u02 == null) {
            F5 f53 = this.f31754g;
            if (f53 != null) {
                ((G5) f53).b("ParseAdResponseWorker", "adUnit is null. fail.");
            }
            b(Boolean.FALSE);
            return;
        }
        if (this.f31752e.n()) {
            F5 f54 = this.f31754g;
            if (f54 != null) {
                ((G5) f54).c("ParseAdResponseWorker", "parsing for ad pods");
            }
            LinkedList<C2793h> linkedListF = this.f31752e.f();
            C2793h first = linkedListF.getFirst();
            kotlin.jvm.internal.e0.checkNotNull(first);
            if (u02.a(first, 0, true)) {
                F5 f55 = this.f31754g;
                if (f55 != null) {
                    ((G5) f55).c("ParseAdResponseWorker", "parse success for ad index 0");
                }
                ListIterator<C2793h> listIterator = linkedListF.listIterator(1);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(listIterator, "listIterator(...)");
                while (listIterator.hasNext()) {
                    C2793h next = listIterator.next();
                    if (!u02.a(next, linkedListF.indexOf(next), false)) {
                        F5 f56 = this.f31754g;
                        if (f56 != null) {
                            ((G5) f56).b("ParseAdResponseWorker", "parseAdResponse fail for index - " + linkedListF.indexOf(next));
                        }
                        listIterator.remove();
                    } else {
                        F5 f57 = this.f31754g;
                        if (f57 != null) {
                            ((G5) f57).c("ParseAdResponseWorker", "parseAdResponse success for index - " + linkedListF.indexOf(next));
                        }
                    }
                }
                b(Boolean.TRUE);
                return;
            }
            F5 f58 = this.f31754g;
            if (f58 != null) {
                ((G5) f58).b("ParseAdResponseWorker", "didParseAdResponseAndExtractData failed");
            }
            b(Boolean.FALSE);
            return;
        }
        F5 f59 = this.f31754g;
        if (f59 != null) {
            ((G5) f59).c("ParseAdResponseWorker", "parsing for single ad");
        }
        b(Boolean.valueOf(u02.a(this.f31751d, 0, true)));
    }
}
