package com.bytedance.sdk.openadsdk.jd;

import com.bytedance.sdk.component.utils.qk;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jpo {
    protected boolean jpo = false;

    /* renamed from: jd, reason: collision with root package name */
    private final ExecutorService f21190jd = Executors.newSingleThreadExecutor();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.jd.jpo$jpo, reason: collision with other inner class name */
    public class CallableC0143jpo implements Callable<Void> {

        /* renamed from: jd, reason: collision with root package name */
        private final File f21191jd;

        @Override // java.util.concurrent.Callable
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            jpo.this.jd(this.f21191jd);
            return null;
        }

        private CallableC0143jpo(File file) {
            this.f21191jd = file;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(File file) throws IOException {
        if (!this.jpo) {
            try {
                qk.jd(file);
            } catch (Throwable unused) {
            }
            jpo(qk.jpo(file.getParentFile()));
        } else {
            List<File> listJpo = qk.jpo(file);
            listJpo.toString();
            jpo(listJpo);
        }
    }

    public abstract void jpo(List<File> list);

    public abstract boolean jpo(long j10, int i10);

    public abstract boolean jpo(File file, long j10, int i10);

    public void jpo(File file) throws IOException {
        this.f21190jd.submit(new CallableC0143jpo(file));
    }

    public long jd(List<File> list) {
        Iterator<File> it = list.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += it.next().length();
        }
        return length;
    }
}
