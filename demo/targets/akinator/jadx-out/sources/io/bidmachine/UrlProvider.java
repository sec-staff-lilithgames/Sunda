package io.bidmachine;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class UrlProvider {
    private static final String PATH_AUCTION = "auction";
    private static final String PATH_INIT = "init";
    private static final String PATH_RTB = "rtb";
    private static final String PATH_V3 = "v3";
    private static String auctionUrlFromInit;
    private static String auctionUrlFromSuccessRequest;
    private static final String DEF_BASE_URL = "https://api.bidmachine.io";
    private static final String[] DEF_BASE_URLS = {DEF_BASE_URL, "https://x.everestop.io", "https://x.blueduckredapple.com", "https://x.thecatmachine.com"};
    private static final Queue<String> INIT_URL_QUEUE = new ConcurrentLinkedQueue();
    private static final Queue<String> AUCTION_URL_QUEUE = new ConcurrentLinkedQueue();

    static {
        setupUrls();
    }

    private static String createAuctionUrl(Uri uri) {
        return uri.buildUpon().appendPath("auction").appendPath(PATH_RTB).appendPath(PATH_V3).toString();
    }

    private static String createInitUrl(Uri uri) {
        return uri.buildUpon().appendPath("auction").appendPath("init").toString();
    }

    public static Queue<String> getAuctionUrlQueue() {
        if (!TextUtils.isEmpty(auctionUrlFromInit)) {
            e4 e4Var = new e4();
            e4Var.add(auctionUrlFromInit);
            return e4Var;
        }
        if (TextUtils.isEmpty(auctionUrlFromSuccessRequest)) {
            return new ConcurrentLinkedQueue(AUCTION_URL_QUEUE);
        }
        e4 e4Var2 = new e4();
        e4Var2.add(auctionUrlFromSuccessRequest);
        return e4Var2;
    }

    public static Queue<String> getInitUrlQueue() {
        return new ConcurrentLinkedQueue(INIT_URL_QUEUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setEndpoint$0(String str) {
        return a.b.k("Endpoint has an invalid format - ", str);
    }

    public static void reset() {
        setupUrls();
        auctionUrlFromInit = null;
        auctionUrlFromSuccessRequest = null;
    }

    public static void setAuctionUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Queue<String> queue = AUCTION_URL_QUEUE;
        queue.clear();
        queue.add(str);
    }

    public static synchronized void setAuctionUrlFromInit(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        auctionUrlFromInit = str;
    }

    public static void setAuctionUrlFromSuccessRequest(String str) {
        if (auctionUrlFromSuccessRequest != null || TextUtils.isEmpty(str)) {
            return;
        }
        auctionUrlFromSuccessRequest = str;
    }

    public static void setEndpoint(String str) {
        if (!nm.j.isUrlValid(str)) {
            nm.a.e(new m0(str, 12));
            return;
        }
        n1 n1VarA = n1.a();
        if (n1VarA.f61919b.get() || n1VarA.f61920c.get()) {
            nm.a.e("Can't change endpoint url after initialization");
            return;
        }
        Uri uri = Uri.parse(str);
        setInitUrl(createInitUrl(uri));
        setAuctionUrl(createAuctionUrl(uri));
    }

    public static void setInitUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Queue<String> queue = INIT_URL_QUEUE;
        queue.clear();
        queue.add(str);
    }

    private static void setupAuctionUrls(Collection<String> collection, String[] strArr) {
        collection.clear();
        for (String str : strArr) {
            collection.add(createAuctionUrl(Uri.parse(str)));
        }
    }

    private static void setupInitUrls(Collection<String> collection, String[] strArr) {
        collection.clear();
        for (String str : strArr) {
            collection.add(createInitUrl(Uri.parse(str)));
        }
    }

    public static void setupUrls() {
        Queue<String> queue = INIT_URL_QUEUE;
        String[] strArr = DEF_BASE_URLS;
        setupInitUrls(queue, strArr);
        setupAuctionUrls(AUCTION_URL_QUEUE, strArr);
    }
}
