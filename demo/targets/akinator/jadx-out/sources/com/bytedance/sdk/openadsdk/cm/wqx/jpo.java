package com.bytedance.sdk.openadsdk.cm.wqx;

import androidx.core.app.NotificationCompat;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.ironsource.C3352n2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.cm.wqx.jpo$jpo, reason: collision with other inner class name */
    public interface InterfaceC0105jpo {

        /* renamed from: cm, reason: collision with root package name */
        public static final String f19696cm;

        /* renamed from: jd, reason: collision with root package name */
        public static final String f19697jd;

        /* renamed from: jj, reason: collision with root package name */
        public static final String f19698jj;
        public static final String jpo;
        public static final String my;
        public static final String wqx;

        static {
            CharSequence[] charSequenceArr = {tic.rv(), "load_start"};
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequenceArr[0]);
            sb2.append((CharSequence) "_");
            sb2.append(charSequenceArr[1]);
            jpo = sb2.toString();
            CharSequence[] charSequenceArr2 = {tic.rv(), "load_finish"};
            StringBuilder sb3 = new StringBuilder();
            sb3.append(charSequenceArr2[0]);
            sb3.append((CharSequence) "_");
            sb3.append(charSequenceArr2[1]);
            f19697jd = sb3.toString();
            CharSequence[] charSequenceArr3 = {tic.rv(), AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL};
            StringBuilder sb4 = new StringBuilder();
            sb4.append(charSequenceArr3[0]);
            sb4.append((CharSequence) "_");
            sb4.append(charSequenceArr3[1]);
            wqx = sb4.toString();
            CharSequence[] charSequenceArr4 = {tic.rv(), tic.pdm()};
            StringBuilder sb5 = new StringBuilder();
            sb5.append(charSequenceArr4[0]);
            sb5.append((CharSequence) "_");
            sb5.append(charSequenceArr4[1]);
            f19696cm = sb5.toString();
            CharSequence[] charSequenceArr5 = {tic.rv(), tic.pdm(), C3352n2.f37928v};
            StringBuilder sb6 = new StringBuilder();
            sb6.append(charSequenceArr5[0]);
            for (int i10 = 1; i10 < 3; i10++) {
                sb6.append((CharSequence) "_");
                sb6.append(charSequenceArr5[i10]);
            }
            my = sb6.toString();
            CharSequence[] charSequenceArr6 = {tic.rv(), tic.pdm(), NotificationCompat.CATEGORY_PROGRESS};
            StringBuilder sb7 = new StringBuilder();
            sb7.append(charSequenceArr6[0]);
            for (int i11 = 1; i11 < 3; i11++) {
                sb7.append((CharSequence) "_");
                sb7.append(charSequenceArr6[i11]);
            }
            f19698jj = sb7.toString();
        }
    }
}
