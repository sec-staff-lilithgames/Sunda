package com.bytedance.sdk.component.my.cm.jpo;

import com.unity3d.ads.BuildConfig;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    private static final TimeUnit jpo = TimeUnit.SECONDS;

    public static ExecutorService jpo() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30L, jpo, new LinkedBlockingQueue(), new jpo(BuildConfig.FLAVOR));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
