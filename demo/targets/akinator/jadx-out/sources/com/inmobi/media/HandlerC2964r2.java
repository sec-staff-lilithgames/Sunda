package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.r2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class HandlerC2964r2 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public F5 f33300a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2964r2(Looper looper) {
        super(looper);
        kotlin.jvm.internal.e0.checkNotNullParameter(looper, "looper");
    }

    public final void a(C2897n2 click) {
        F5 f52 = this.f33300a;
        if (f52 != null) {
            String strF = C3100z2.f();
            ((G5) f52).a(strF, AbstractC2962r0.a(N6.a(strF, "access$getTAG$p(...)", "Retry attemps exhausted for click ("), click.f33111b, ')'));
        }
        b(click);
        C3100z2.f33672a.a(click, "RETRY_EXHAUSTED");
        C2914o2 c2914o2B = AbstractC2807hd.b();
        c2914o2B.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(click, "click");
        c2914o2B.a("id = ?", new String[]{String.valueOf(click.f33110a)});
        C3100z2.f33676e.remove(click);
    }

    public final void b(C2897n2 c2897n2) {
        int iIndexOf = uu.y0.indexOf((List<? extends C2897n2>) C3100z2.f33676e, c2897n2);
        if (-1 != iIndexOf) {
            C2897n2 c2897n22 = (C2897n2) C3100z2.f33676e.get(iIndexOf == C3100z2.f33676e.size() + (-1) ? 0 : iIndexOf + 1);
            Message messageObtain = Message.obtain();
            messageObtain.what = c2897n22.f33114e ? 3 : 2;
            messageObtain.obj = c2897n22;
            AdConfig.ImaiConfig imaiConfig = C3100z2.f33678g;
            long pingInterval = (imaiConfig != null ? imaiConfig.getPingInterval() : 0) * 1000;
            if (System.currentTimeMillis() - c2897n22.f33116g < pingInterval) {
                sendMessageDelayed(messageObtain, pingInterval);
            } else {
                sendMessage(messageObtain);
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        kotlin.jvm.internal.e0.checkNotNullParameter(msg, "msg");
        if (C3100z2.f33679h.get()) {
            try {
                int i10 = msg.what;
                int i11 = 3;
                if (i10 == 1) {
                    if (C3100z2.f33672a.g()) {
                        AdConfig.ImaiConfig imaiConfig = C3100z2.f33678g;
                        C2914o2 c2914o2B = AbstractC2807hd.b();
                        if (imaiConfig == null) {
                            F5 f52 = this.f33300a;
                            if (f52 != null) {
                                String strF = C3100z2.f();
                                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strF, "access$getTAG$p(...)");
                                ((G5) f52).b(strF, "Unhandled message due to ImaiConfig Null");
                                return;
                            }
                            return;
                        }
                        C3100z2.f33676e = c2914o2B.a(imaiConfig.getMaxEventBatch(), imaiConfig.getPingInterval());
                        if (C3100z2.f33676e.isEmpty()) {
                            if (V1.a(c2914o2B, null, null, 63) == 0) {
                                C3100z2.f33677f.set(false);
                                return;
                            }
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 1;
                            sendMessageDelayed(messageObtain, imaiConfig.getPingInterval() * 1000);
                            return;
                        }
                        F5 f53 = this.f33300a;
                        if (f53 != null) {
                            String strF2 = C3100z2.f();
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strF2, "access$getTAG$p(...)");
                            ((G5) f53).a(strF2, "Processing following click batch");
                        }
                        for (C2897n2 c2897n2 : C3100z2.f33676e) {
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(C3100z2.f(), "access$getTAG$p(...)");
                            String str = c2897n2.f33111b;
                        }
                        C2897n2 c2897n22 = (C2897n2) C3100z2.f33676e.get(0);
                        Message messageObtain2 = Message.obtain();
                        if (!c2897n22.f33114e) {
                            i11 = 2;
                        }
                        messageObtain2.what = i11;
                        messageObtain2.obj = c2897n22;
                        long jCurrentTimeMillis = System.currentTimeMillis() - c2897n22.f33116g;
                        if (jCurrentTimeMillis < imaiConfig.getPingInterval() * 1000) {
                            sendMessageDelayed(messageObtain2, (imaiConfig.getPingInterval() * 1000) - jCurrentTimeMillis);
                            return;
                        } else {
                            sendMessage(messageObtain2);
                            return;
                        }
                    }
                    return;
                }
                if (i10 == 2) {
                    if (C2736da.a(false) != null) {
                        C3100z2.f33677f.set(false);
                        C3100z2.a(C3100z2.f33672a);
                        return;
                    }
                    Object obj = msg.obj;
                    AdConfig.ImaiConfig imaiConfig2 = C3100z2.f33678g;
                    if ((obj instanceof C2897n2) && imaiConfig2 != null) {
                        if (((C2897n2) obj).f33115f != 0) {
                            if (System.currentTimeMillis() - ((C2897n2) obj).f33117h <= imaiConfig2.getPingCacheExpiry() * 1000) {
                                int maxRetries = (imaiConfig2.getMaxRetries() - ((C2897n2) obj).f33115f) + 1;
                                if (maxRetries == 0) {
                                    F5 f54 = this.f33300a;
                                    if (f54 != null) {
                                        String strF3 = C3100z2.f();
                                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strF3, "access$getTAG$p(...)");
                                        ((G5) f54).a(strF3, "Pinging click (" + ((C2897n2) obj).f33111b + ") over HTTP");
                                    }
                                } else {
                                    F5 f55 = this.f33300a;
                                    if (f55 != null) {
                                        String strF4 = C3100z2.f();
                                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strF4, "access$getTAG$p(...)");
                                        ((G5) f55).a(strF4, "Retry attempt #" + maxRetries + " for click (" + ((C2897n2) obj).f33111b + ") over HTTP");
                                    }
                                }
                                new C3015u2(new C2931p2(this), this.f33300a).a((C2897n2) obj);
                                return;
                            }
                        }
                        a((C2897n2) obj);
                        return;
                    }
                    F5 f56 = this.f33300a;
                    if (f56 != null) {
                        String strF5 = C3100z2.f();
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strF5, "access$getTAG$p(...)");
                        ((G5) f56).b(strF5, "Unhandled message due to ImaiConfig Null");
                        return;
                    }
                    return;
                }
                if (i10 == 3) {
                    if (C2736da.a(false) != null) {
                        C3100z2.f33677f.set(false);
                        C3100z2.a(C3100z2.f33672a);
                        return;
                    }
                    Object obj2 = msg.obj;
                    AdConfig.ImaiConfig imaiConfig3 = C3100z2.f33678g;
                    if ((obj2 instanceof C2897n2) && imaiConfig3 != null) {
                        if (((C2897n2) obj2).f33115f != 0) {
                            if (System.currentTimeMillis() - ((C2897n2) obj2).f33117h <= imaiConfig3.getPingCacheExpiry() * 1000) {
                                int maxRetries2 = (imaiConfig3.getMaxRetries() - ((C2897n2) obj2).f33115f) + 1;
                                if (maxRetries2 == 0) {
                                    F5 f57 = this.f33300a;
                                    if (f57 != null) {
                                        String strF6 = C3100z2.f();
                                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strF6, "access$getTAG$p(...)");
                                        ((G5) f57).a(strF6, "Pinging click (" + ((C2897n2) obj2).f33111b + ") in WebView");
                                    }
                                } else {
                                    F5 f58 = this.f33300a;
                                    if (f58 != null) {
                                        String strF7 = C3100z2.f();
                                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strF7, "access$getTAG$p(...)");
                                        ((G5) f58).b(strF7, "Retry attempt #" + maxRetries2 + " for click (" + ((C2897n2) obj2).f33111b + ") using WebView");
                                    }
                                }
                                new C2998t2(new C2948q2(this), this.f33300a).a((C2897n2) obj2);
                                return;
                            }
                        }
                        a((C2897n2) obj2);
                        return;
                    }
                    F5 f59 = this.f33300a;
                    if (f59 != null) {
                        String strF8 = C3100z2.f();
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strF8, "access$getTAG$p(...)");
                        ((G5) f59).b(strF8, "Unhandled message due to ImaiConfig Null");
                        return;
                    }
                    return;
                }
                if (i10 != 4) {
                    F5 f510 = this.f33300a;
                    if (f510 != null) {
                        String strF9 = C3100z2.f();
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strF9, "access$getTAG$p(...)");
                        ((G5) f510).b(strF9, "Unhandled message ( " + msg.what + " ) in pingHandler");
                        return;
                    }
                    return;
                }
                Object obj3 = msg.obj;
                kotlin.jvm.internal.e0.checkNotNull(obj3, "null cannot be cast to non-null type com.inmobi.ads.core.Click");
                C2897n2 click = (C2897n2) obj3;
                F5 f511 = this.f33300a;
                if (f511 != null) {
                    String strF10 = C3100z2.f();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strF10, "access$getTAG$p(...)");
                    ((G5) f511).a(strF10, "Processing click (" + click.f33111b + ") completed");
                }
                C3100z2.b(C3100z2.f33672a, click);
                C2914o2 c2914o2B2 = AbstractC2807hd.b();
                c2914o2B2.getClass();
                kotlin.jvm.internal.e0.checkNotNullParameter(click, "click");
                c2914o2B2.a("id = ?", new String[]{String.valueOf(click.f33110a)});
                C3100z2.f33676e.remove(click);
                if (!C3100z2.f33676e.isEmpty()) {
                    C2897n2 c2897n23 = (C2897n2) C3100z2.f33676e.get(0);
                    Message messageObtain3 = Message.obtain();
                    if (c2897n23 == null || !c2897n23.f33114e) {
                        i11 = 2;
                    }
                    messageObtain3.what = i11;
                    messageObtain3.obj = c2897n23;
                    sendMessage(messageObtain3);
                    return;
                }
                C2914o2 c2914o2B3 = AbstractC2807hd.b();
                c2914o2B3.getClass();
                if (V1.a(c2914o2B3, null, null, 63) != 0) {
                    Message messageObtain4 = Message.obtain();
                    messageObtain4.what = 1;
                    sendMessage(messageObtain4);
                } else {
                    F5 f512 = this.f33300a;
                    if (f512 != null) {
                        String strF11 = C3100z2.f();
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strF11, "access$getTAG$p(...)");
                        ((G5) f512).a(strF11, "Done processing all clicks!");
                    }
                    C3100z2.f33677f.set(false);
                }
            } catch (Exception e10) {
                F5 f513 = this.f33300a;
                if (f513 != null) {
                    String strF12 = C3100z2.f();
                    ((G5) f513).b(strF12, Qf.a(e10, N6.a(strF12, "access$getTAG$p(...)", "SDK encountered unexpected error in processing ping; ")));
                }
            }
        }
    }
}
