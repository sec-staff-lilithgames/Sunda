package com.mbridge.msdk.video.signal.communication;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.u0;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class RewardSignal extends BaseRewardSignal implements BaseIRewardCommunication {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f44889i = 0;

    /* renamed from: h, reason: collision with root package name */
    private Handler f44890h = new Handler(Looper.getMainLooper());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44891a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44892b;

        public a(Object obj, String str) {
            this.f44891a = obj;
            this.f44892b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.getEndScreenInfo(this.f44891a, this.f44892b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44894a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44895b;

        public b(Object obj, String str) {
            this.f44894a = obj;
            this.f44895b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.install(this.f44894a, this.f44895b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44897a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44898b;

        public c(Object obj, String str) {
            this.f44897a = obj;
            this.f44898b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.notifyCloseBtn(this.f44897a, this.f44898b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44900a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44901b;

        public d(Object obj, String str) {
            this.f44900a = obj;
            this.f44901b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.toggleCloseBtn(this.f44900a, this.f44901b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44903a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44904b;

        public e(Object obj, String str) {
            this.f44903a = obj;
            this.f44904b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.getEndScreenInfo(this.f44903a, this.f44904b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44906a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44907b;

        public f(Object obj, String str) {
            this.f44906a = obj;
            this.f44907b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.setOrientation(this.f44906a, this.f44907b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44909a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44910b;

        public g(Object obj, String str) {
            this.f44909a = obj;
            this.f44910b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.handlerPlayableException(this.f44909a, this.f44910b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44912a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44913b;

        public h(Object obj, String str) {
            this.f44912a = obj;
            this.f44913b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            RewardSignal.super.openURL(this.f44912a, this.f44913b);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        if (u0.h()) {
            super.getEndScreenInfo(obj, str);
        } else {
            this.f44890h.post(new a(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
        if (u0.h()) {
            super.handlerPlayableException(obj, str);
        } else {
            this.f44890h.post(new g(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        if (u0.h()) {
            super.install(obj, str);
        } else {
            this.f44890h.post(new b(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
        if (u0.h()) {
            super.notifyCloseBtn(obj, str);
        } else {
            this.f44890h.post(new c(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) throws JSONException {
        if (u0.h()) {
            super.openURL(obj, str);
        } else {
            this.f44890h.post(new h(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
        if (u0.h()) {
            super.setOrientation(obj, str);
        } else {
            this.f44890h.post(new f(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        if (u0.h()) {
            super.toggleCloseBtn(obj, str);
        } else {
            this.f44890h.post(new d(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        if (u0.h()) {
            super.triggerCloseBtn(obj, str);
        } else {
            this.f44890h.post(new e(obj, str));
        }
    }
}
