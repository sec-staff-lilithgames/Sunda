package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.e6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1983e6 extends AnimatorListenerAdapter {
    public static String[] A01 = {"TrZNDxp7XgPrLwMeMcKKV4LE6uuIfYVU", "ULEyXJCc47teQ6YZ0eXPV0V7C", "At5pbwNHr2LiheLI", "DEC0Eom9qK7OI0oKL1WQ5oYEbz9lc5Gt", "Go2f3K9Z", "jmF0Wp1VVfzp13IVqL", "AKLTgtcpjio1lTTBDL2vrOjYxOjCOJfp", "yZ5UHZcmQhcxGg9JLD5yPnSTYa225zYb"};
    public final /* synthetic */ CZ A00;

    public C1983e6(CZ cz) {
        this.A00 = cz;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.A00.A04) {
            XP.A0F(this.A00.A03);
        }
        CZ cz = this.A00;
        if (A01[5].length() == 4) {
            throw new RuntimeException();
        }
        A01[2] = "6jsFEd17ts6f8PQH6w";
        cz.A03.setAlpha(0.0f);
        this.A00.A01 = EnumC1978e1.A04;
        if (this.A00.A00 != null) {
            this.A00.A00.setListener(null);
            this.A00.A00 = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A01 = EnumC1978e1.A02;
        if (this.A00.A00 != null) {
            this.A00.A00.setListener(null);
            this.A00.A00 = null;
        }
    }
}
