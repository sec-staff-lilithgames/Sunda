package com.mbridge.msdk.video.signal.communication;

import android.os.Handler;
import android.os.Looper;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class VideoCommunication extends BaseVideoCommunication {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f44915j = 0;

    /* renamed from: i, reason: collision with root package name */
    private Handler f44916i = new Handler(Looper.getMainLooper());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44917a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44918b;

        public a(Object obj, String str) {
            this.f44917a = obj;
            this.f44918b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.progressBarOperate(this.f44917a, this.f44918b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44920a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44921b;

        public a0(Object obj, String str) {
            this.f44920a = obj;
            this.f44921b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.setViewRect(this.f44920a, this.f44921b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44923a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44924b;

        public a1(Object obj, String str) {
            this.f44923a = obj;
            this.f44924b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.playerUpdateFrame(this.f44923a, this.f44924b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44926a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44927b;

        public a2(Object obj, String str) {
            this.f44926a = obj;
            this.f44927b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getRewardUnitSetting(this.f44926a, this.f44927b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44929a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44930b;

        public b(Object obj, String str) {
            this.f44929a = obj;
            this.f44930b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getCurrentProgress(this.f44929a, this.f44930b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44932a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44933b;

        public b0(Object obj, String str) {
            this.f44932a = obj;
            this.f44933b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.removeFromSuperView(this.f44932a, this.f44933b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44935a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44936b;

        public b1(Object obj, String str) {
            this.f44935a = obj;
            this.f44936b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.playerMute(this.f44935a, this.f44936b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44938a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44939b;

        public b2(Object obj, String str) {
            this.f44938a = obj;
            this.f44939b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getUnitSetting(this.f44938a, this.f44939b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44941a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44942b;

        public c(Object obj, String str) {
            this.f44941a = obj;
            this.f44942b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showVideoClickView(this.f44941a, this.f44942b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44944a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44945b;

        public c0(Object obj, String str) {
            this.f44944a = obj;
            this.f44945b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.appendSubView(this.f44944a, this.f44945b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44947a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44948b;

        public c1(Object obj, String str) {
            this.f44947a = obj;
            this.f44948b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showVideoLocation(this.f44947a, this.f44948b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44950a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44951b;

        public c2(Object obj, String str) {
            this.f44950a = obj;
            this.f44951b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getEncryptPrice(this.f44950a, this.f44951b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44953a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44954b;

        public d(Object obj, String str) {
            this.f44953a = obj;
            this.f44954b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setScaleFitXY(this.f44953a, this.f44954b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44956a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44957b;

        public d0(Object obj, String str) {
            this.f44956a = obj;
            this.f44957b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.appendViewTo(this.f44956a, this.f44957b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44959a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44960b;

        public d1(Object obj, String str) {
            this.f44959a = obj;
            this.f44960b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.playerUnmute(this.f44959a, this.f44960b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44962a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44963b;

        public d2(Object obj, String str) {
            this.f44962a = obj;
            this.f44963b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.closeVideoOperte(this.f44962a, this.f44963b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44965a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44966b;

        public e(Object obj, String str) {
            this.f44965a = obj;
            this.f44966b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.notifyCloseBtn(this.f44965a, this.f44966b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44968a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44969b;

        public e0(Object obj, String str) {
            this.f44968a = obj;
            this.f44969b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.onlyAppendSubView(this.f44968a, this.f44969b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44971a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44972b;

        public e1(Object obj, String str) {
            this.f44971a = obj;
            this.f44972b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.playerGetMuteState(this.f44971a, this.f44972b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44974a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44975b;

        public e2(Object obj, String str) {
            this.f44974a = obj;
            this.f44975b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.progressOperate(this.f44974a, this.f44975b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44977a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44978b;

        public f(Object obj, String str) {
            this.f44977a = obj;
            this.f44978b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.toggleCloseBtn(this.f44977a, this.f44978b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44980a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44981b;

        public f0(Object obj, String str) {
            this.f44980a = obj;
            this.f44981b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.onlyAppendViewTo(this.f44980a, this.f44981b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44983a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44984b;

        public f1(Object obj, String str) {
            this.f44983a = obj;
            this.f44984b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.playerSetSource(this.f44983a, this.f44984b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44986a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44987b;

        public g(Object obj, String str) {
            this.f44986a = obj;
            this.f44987b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.handlerH5Exception(this.f44986a, this.f44987b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44989a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44990b;

        public g0(Object obj, String str) {
            this.f44989a = obj;
            this.f44990b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.statistics(this.f44989a, this.f44990b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44992a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44993b;

        public g1(Object obj, String str) {
            this.f44992a = obj;
            this.f44993b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.playerSetRenderType(this.f44992a, this.f44993b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44995a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44996b;

        public h(Object obj, String str) {
            this.f44995a = obj;
            this.f44996b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.isSystemResume(this.f44995a, this.f44996b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44998a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44999b;

        public h0(Object obj, String str) {
            this.f44998a = obj;
            this.f44999b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.bringViewToFront(this.f44998a, this.f44999b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45001a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45002b;

        public h1(Object obj, String str) {
            this.f45001a = obj;
            this.f45002b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.preloadSubPlayTemplateView(this.f45001a, this.f45002b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45004a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45005b;

        public i(Object obj, String str) {
            this.f45004a = obj;
            this.f45005b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.readyStatus(this.f45004a, this.f45005b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class i0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45007a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45008b;

        public i0(Object obj, String str) {
            this.f45007a = obj;
            this.f45008b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.hideView(this.f45007a, this.f45008b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class i1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45010a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45011b;

        public i1(Object obj, String str) {
            this.f45010a = obj;
            this.f45011b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.closeAd(this.f45010a, this.f45011b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45013a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45014b;

        public j(Object obj, String str) {
            this.f45013a = obj;
            this.f45014b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playVideoFinishOperate(this.f45013a, this.f45014b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class j0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45016a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45017b;

        public j0(Object obj, String str) {
            this.f45016a = obj;
            this.f45017b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.showView(this.f45016a, this.f45017b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class j1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45019a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45020b;

        public j1(Object obj, String str) {
            this.f45019a = obj;
            this.f45020b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.broadcast(this.f45019a, this.f45020b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45022a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45023b;

        public k(Object obj, String str) {
            this.f45022a = obj;
            this.f45023b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.init(this.f45022a, this.f45023b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class k0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45025a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45026b;

        public k0(Object obj, String str) {
            this.f45025a = obj;
            this.f45026b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.setViewBgColor(this.f45025a, this.f45026b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class k1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45028a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45029b;

        public k1(Object obj, String str) {
            this.f45028a = obj;
            this.f45029b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.ivRewardAdsWithoutVideo(this.f45028a, this.f45029b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45031a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45032b;

        public l(Object obj, String str) {
            this.f45031a = obj;
            this.f45032b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.openURL(this.f45031a, this.f45032b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class l0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45034a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45035b;

        public l0(Object obj, String str) {
            this.f45034a = obj;
            this.f45035b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.setViewAlpha(this.f45034a, this.f45035b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class l1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45037a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45038b;

        public l1(Object obj, String str) {
            this.f45037a = obj;
            this.f45038b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.setSubPlayTemplateInfo(this.f45037a, this.f45038b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45040a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45041b;

        public m(Object obj, String str) {
            this.f45040a = obj;
            this.f45041b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showAlertView(this.f45040a, this.f45041b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class m0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45043a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45044b;

        public m0(Object obj, String str) {
            this.f45043a = obj;
            this.f45044b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.setViewScale(this.f45043a, this.f45044b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class m1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45046a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45047b;

        public m1(Object obj, String str) {
            this.f45046a = obj;
            this.f45047b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.webviewFireEvent(this.f45046a, this.f45047b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45049a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45050b;

        public n(Object obj, String str) {
            this.f45049a = obj;
            this.f45050b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.closeWeb(this.f45049a, this.f45050b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class n0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45052a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45053b;

        public n0(Object obj, String str) {
            this.f45052a = obj;
            this.f45053b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.insertViewAbove(this.f45052a, this.f45053b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class n1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45055a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45056b;

        public n1(Object obj, String str) {
            this.f45055a = obj;
            this.f45056b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.soundOperate(this.f45055a, this.f45056b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45058a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45059b;

        public o(Object obj, String str) {
            this.f45058a = obj;
            this.f45059b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getSDKInfo(this.f45058a, this.f45059b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class o0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45061a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45062b;

        public o0(Object obj, String str) {
            this.f45061a = obj;
            this.f45062b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.insertViewBelow(this.f45061a, this.f45062b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class o1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45064a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45065b;

        public o1(Object obj, String str) {
            this.f45064a = obj;
            this.f45065b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.increaseOfferFrequence(this.f45064a, this.f45065b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45067a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45068b;

        public p(Object obj, String str) {
            this.f45067a = obj;
            this.f45068b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.getFileInfo(this.f45067a, this.f45068b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class p0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45070a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45071b;

        public p0(Object obj, String str) {
            this.f45070a = obj;
            this.f45071b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.onlyInsertViewAbove(this.f45070a, this.f45071b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class p1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45073a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45074b;

        public p1(Object obj, String str) {
            this.f45073a = obj;
            this.f45074b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.handleNativeObject(this.f45073a, this.f45074b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class q implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45076a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45077b;

        public q(Object obj, String str) {
            this.f45076a = obj;
            this.f45077b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.loadads(this.f45076a, this.f45077b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class q0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45079a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45080b;

        public q0(Object obj, String str) {
            this.f45079a = obj;
            this.f45080b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.onlyInsertViewBelow(this.f45079a, this.f45080b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class q1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45082a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45083b;

        public q1(Object obj, String str) {
            this.f45082a = obj;
            this.f45083b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.loadingResourceStatus(this.f45082a, this.f45083b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class r implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45085a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45086b;

        public r(Object obj, String str) {
            this.f45085a = obj;
            this.f45086b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.reactDeveloper(this.f45085a, this.f45086b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class r0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45088a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45089b;

        public r0(Object obj, String str) {
            this.f45088a = obj;
            this.f45089b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.triggerCloseBtn(this.f45088a, this.f45089b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class r1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45091a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45092b;

        public r1(Object obj, String str) {
            this.f45091a = obj;
            this.f45092b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.createNativeEC(this.f45091a, this.f45092b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class s implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45094a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45095b;

        public s(Object obj, String str) {
            this.f45094a = obj;
            this.f45095b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.reportUrls(this.f45094a, this.f45095b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class s0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45097a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45098b;

        public s0(Object obj, String str) {
            this.f45097a = obj;
            this.f45098b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.webviewLoad(this.f45097a, this.f45098b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class s1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45100a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45101b;

        public s1(Object obj, String str) {
            this.f45100a = obj;
            this.f45101b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setCacheItem(this.f45100a, this.f45101b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class t implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45103a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45104b;

        public t(Object obj, String str) {
            this.f45103a = obj;
            this.f45104b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.createWebview(this.f45103a, this.f45104b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class t0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45106a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45107b;

        public t0(Object obj, String str) {
            this.f45106a = obj;
            this.f45107b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.webviewReload(this.f45106a, this.f45107b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class t1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45109a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45110b;

        public t1(Object obj, String str) {
            this.f45109a = obj;
            this.f45110b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.removeCacheItem(this.f45109a, this.f45110b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class u implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45112a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45113b;

        public u(Object obj, String str) {
            this.f45112a = obj;
            this.f45113b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.createView(this.f45112a, this.f45113b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class u0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45115a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45116b;

        public u0(Object obj, String str) {
            this.f45115a = obj;
            this.f45116b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.webviewGoBack(this.f45115a, this.f45116b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class u1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45118a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45119b;

        public u1(Object obj, String str) {
            this.f45118a = obj;
            this.f45119b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getAllCache(this.f45118a, this.f45119b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class v implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45121a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45122b;

        public v(Object obj, String str) {
            this.f45121a = obj;
            this.f45122b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.click(this.f45121a, this.f45122b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class v0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45124a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45125b;

        public v0(Object obj, String str) {
            this.f45124a = obj;
            this.f45125b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.webviewGoForward(this.f45124a, this.f45125b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class v1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45127a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45128b;

        public v1(Object obj, String str) {
            this.f45127a = obj;
            this.f45128b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.clearAllCache(this.f45127a, this.f45128b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class w implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45130a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45131b;

        public w(Object obj, String str) {
            this.f45130a = obj;
            this.f45131b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.createPlayerView(this.f45130a, this.f45131b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class w0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45133a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45134b;

        public w0(Object obj, String str) {
            this.f45133a = obj;
            this.f45134b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.playerPlay(this.f45133a, this.f45134b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class w1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45136a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45137b;

        public w1(Object obj, String str) {
            this.f45136a = obj;
            this.f45137b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getCutout(this.f45136a, this.f45137b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class x implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45139a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45140b;

        public x(Object obj, String str) {
            this.f45139a = obj;
            this.f45140b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.createSubPlayTemplateView(this.f45139a, this.f45140b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class x0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45142a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45143b;

        public x0(Object obj, String str) {
            this.f45142a = obj;
            this.f45143b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.playerPause(this.f45142a, this.f45143b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class x1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45145a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45146b;

        public x1(Object obj, String str) {
            this.f45145a = obj;
            this.f45146b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getAppSetting(this.f45145a, this.f45146b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class y implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45148a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45149b;

        public y(Object obj, String str) {
            this.f45148a = obj;
            this.f45149b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.destroyComponent(this.f45148a, this.f45149b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class y0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45151a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45152b;

        public y0(Object obj, String str) {
            this.f45151a = obj;
            this.f45152b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.playerResume(this.f45151a, this.f45152b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class y1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45154a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45155b;

        public y1(Object obj, String str) {
            this.f45154a = obj;
            this.f45155b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.videoOperate(this.f45154a, this.f45155b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class z implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45157a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45158b;

        public z(Object obj, String str) {
            this.f45157a = obj;
            this.f45158b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.getComponentOptions(this.f45157a, this.f45158b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class z0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45160a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45161b;

        public z0(Object obj, String str) {
            this.f45160a = obj;
            this.f45161b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            VideoCommunication.super.playerStop(this.f45160a, this.f45161b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class z1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f45163a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45164b;

        public z1(Object obj, String str) {
            this.f45163a = obj;
            this.f45164b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getRewardSetting(this.f45163a, this.f45164b);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void appendSubView(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.appendSubView(obj, str);
        } else {
            this.f44916i.post(new c0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void appendViewTo(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.appendViewTo(obj, str);
        } else {
            this.f44916i.post(new d0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void bringViewToFront(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.bringViewToFront(obj, str);
        } else {
            this.f44916i.post(new h0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void broadcast(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.broadcast(obj, str);
        } else {
            this.f44916i.post(new j1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void clearAllCache(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.clearAllCache(obj, str);
        } else {
            this.f44916i.post(new v1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void click(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.click(obj, str);
        } else {
            this.f44916i.post(new v(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeAd(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.closeAd(obj, str);
        } else {
            this.f44916i.post(new i1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeVideoOperte(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.closeVideoOperte(obj, str);
        } else {
            this.f44916i.post(new d2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeWeb(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.closeWeb(obj, str);
            return;
        }
        this.f44916i.post(new n(obj, str));
        com.mbridge.msdk.foundation.tools.p0.b("JS-Video-Brigde", "type" + str);
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createNativeEC(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.createNativeEC(obj, str);
        } else {
            this.f44916i.post(new r1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createPlayerView(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.createPlayerView(obj, str);
        } else {
            this.f44916i.post(new w(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createSubPlayTemplateView(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.createSubPlayTemplateView(obj, str);
        } else {
            this.f44916i.post(new x(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createView(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.createView(obj, str);
        } else {
            this.f44916i.post(new u(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createWebview(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.createWebview(obj, str);
        } else {
            this.f44916i.post(new t(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void destroyComponent(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.destroyComponent(obj, str);
        } else {
            this.f44916i.post(new y(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getAllCache(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.getAllCache(obj, str);
        } else {
            this.f44916i.post(new u1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getAppSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.getAppSetting(obj, str);
        } else {
            this.f44916i.post(new x1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getComponentOptions(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.getComponentOptions(obj, str);
        } else {
            this.f44916i.post(new z(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getCurrentProgress(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.getCurrentProgress(obj, str);
        } else {
            this.f44916i.post(new b(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getCutout(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.getCutout(obj, str);
        } else {
            this.f44916i.post(new w1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getEncryptPrice(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.getEncryptPrice(obj, str);
        } else {
            this.f44916i.post(new c2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getFileInfo(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.getFileInfo(obj, str);
        } else {
            this.f44916i.post(new p(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getRewardSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.getRewardSetting(obj, str);
        } else {
            this.f44916i.post(new z1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getRewardUnitSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.getRewardUnitSetting(obj, str);
        } else {
            this.f44916i.post(new a2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getSDKInfo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.getSDKInfo(obj, str);
        } else {
            this.f44916i.post(new o(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getUnitSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.getUnitSetting(obj, str);
        } else {
            this.f44916i.post(new b2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void handleNativeObject(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.handleNativeObject(obj, str);
        } else {
            this.f44916i.post(new p1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void handlerH5Exception(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.handlerH5Exception(obj, str);
        } else {
            this.f44916i.post(new g(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void hideView(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.hideView(obj, str);
        } else {
            this.f44916i.post(new i0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void increaseOfferFrequence(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.increaseOfferFrequence(obj, str);
        } else {
            this.f44916i.post(new o1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void init(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.init(obj, str);
        } else {
            this.f44916i.post(new k(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void insertViewAbove(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.insertViewAbove(obj, str);
        } else {
            this.f44916i.post(new n0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void insertViewBelow(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.insertViewBelow(obj, str);
        } else {
            this.f44916i.post(new o0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void isSystemResume(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.isSystemResume(obj, str);
        } else {
            this.f44916i.post(new h(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void ivRewardAdsWithoutVideo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.ivRewardAdsWithoutVideo(obj, str);
        } else {
            this.f44916i.post(new k1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void loadads(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.loadads(obj, str);
        } else {
            this.f44916i.post(new q(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void loadingResourceStatus(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.loadingResourceStatus(obj, str);
        } else {
            this.f44916i.post(new q1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void notifyCloseBtn(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.notifyCloseBtn(obj, str);
        } else {
            this.f44916i.post(new e(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyAppendSubView(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.onlyAppendSubView(obj, str);
        } else {
            this.f44916i.post(new e0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyAppendViewTo(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.onlyAppendViewTo(obj, str);
        } else {
            this.f44916i.post(new f0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyInsertViewAbove(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.onlyInsertViewAbove(obj, str);
        } else {
            this.f44916i.post(new p0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyInsertViewBelow(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.onlyInsertViewBelow(obj, str);
        } else {
            this.f44916i.post(new q0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void openURL(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.openURL(obj, str);
        } else {
            this.f44916i.post(new l(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playVideoFinishOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.playVideoFinishOperate(obj, str);
        } else {
            this.f44916i.post(new j(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerGetMuteState(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.playerGetMuteState(obj, str);
        } else {
            this.f44916i.post(new e1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerMute(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.playerMute(obj, str);
        } else {
            this.f44916i.post(new b1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerPause(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.playerPause(obj, str);
        } else {
            this.f44916i.post(new x0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerPlay(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.playerPlay(obj, str);
        } else {
            this.f44916i.post(new w0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerResume(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.playerResume(obj, str);
        } else {
            this.f44916i.post(new y0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerSetRenderType(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.playerSetRenderType(obj, str);
        } else {
            this.f44916i.post(new g1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerSetSource(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.playerSetSource(obj, str);
        } else {
            this.f44916i.post(new f1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerStop(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.playerStop(obj, str);
        } else {
            this.f44916i.post(new z0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerUnmute(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.playerUnmute(obj, str);
        } else {
            this.f44916i.post(new d1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerUpdateFrame(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.playerUpdateFrame(obj, str);
        } else {
            this.f44916i.post(new a1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void preloadSubPlayTemplateView(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.preloadSubPlayTemplateView(obj, str);
        } else {
            this.f44916i.post(new h1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void progressBarOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.progressBarOperate(obj, str);
        } else {
            this.f44916i.post(new a(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void progressOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.progressOperate(obj, str);
        } else {
            this.f44916i.post(new e2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reactDeveloper(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.reactDeveloper(obj, str);
        } else {
            this.f44916i.post(new r(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void readyStatus(Object obj, String str) {
        com.mbridge.msdk.foundation.tools.p0.c("JS-Video-Brigde", "VIDEOBridge readyStatus");
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.readyStatus(obj, str);
        } else {
            this.f44916i.post(new i(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void removeCacheItem(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.removeCacheItem(obj, str);
        } else {
            this.f44916i.post(new t1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void removeFromSuperView(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.removeFromSuperView(obj, str);
        } else {
            this.f44916i.post(new b0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reportUrls(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.reportUrls(obj, str);
        } else {
            this.f44916i.post(new s(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setCacheItem(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.setCacheItem(obj, str);
        } else {
            this.f44916i.post(new s1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setScaleFitXY(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.setScaleFitXY(obj, str);
        } else {
            this.f44916i.post(new d(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setSubPlayTemplateInfo(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.setSubPlayTemplateInfo(obj, str);
        } else {
            this.f44916i.post(new l1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewAlpha(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.setViewAlpha(obj, str);
        } else {
            this.f44916i.post(new l0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewBgColor(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.setViewBgColor(obj, str);
        } else {
            this.f44916i.post(new k0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewRect(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.setViewRect(obj, str);
        } else {
            this.f44916i.post(new a0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewScale(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.setViewScale(obj, str);
        } else {
            this.f44916i.post(new m0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showAlertView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.showAlertView(obj, str);
        } else {
            this.f44916i.post(new m(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showVideoClickView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.showVideoClickView(obj, str);
        } else {
            this.f44916i.post(new c(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showVideoLocation(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.showVideoLocation(obj, str);
        } else {
            this.f44916i.post(new c1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showView(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.showView(obj, str);
        } else {
            this.f44916i.post(new j0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void soundOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.soundOperate(obj, str);
        } else {
            this.f44916i.post(new n1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void statistics(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.statistics(obj, str);
        } else {
            this.f44916i.post(new g0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void toggleCloseBtn(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.toggleCloseBtn(obj, str);
        } else {
            this.f44916i.post(new f(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void triggerCloseBtn(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.triggerCloseBtn(obj, str);
        } else {
            this.f44916i.post(new r0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void videoOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.videoOperate(obj, str);
        } else {
            this.f44916i.post(new y1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewFireEvent(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.webviewFireEvent(obj, str);
        } else {
            this.f44916i.post(new m1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewGoBack(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.webviewGoBack(obj, str);
        } else {
            this.f44916i.post(new u0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewGoForward(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.webviewGoForward(obj, str);
        } else {
            this.f44916i.post(new v0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewLoad(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.webviewLoad(obj, str);
        } else {
            this.f44916i.post(new s0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewReload(Object obj, String str) throws JSONException {
        if (com.mbridge.msdk.foundation.tools.u0.h()) {
            super.webviewReload(obj, str);
        } else {
            this.f44916i.post(new t0(obj, str));
        }
    }
}
