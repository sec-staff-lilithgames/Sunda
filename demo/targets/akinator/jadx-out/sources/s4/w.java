package s4;

import android.content.Context;
import com.google.android.exoplayer2.util.j1;
import io.bidmachine.media3.exoplayer.b1;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w implements p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f85468a;

    public w(Context context) {
        this.f85468a = context.getApplicationContext();
    }

    @Override // s4.p
    public void load(q qVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new j1("EmojiCompatInitializer", 5));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new b1(this, 14, qVar, threadPoolExecutor));
    }
}
