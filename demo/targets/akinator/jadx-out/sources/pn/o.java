package pn;

import android.net.Uri;
import go.b0;
import io.bidmachine.media3.common.util.a1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o implements b0 {
    @Override // go.b0
    public Long parse(Uri uri, InputStream inputStream) throws IOException {
        return Long.valueOf(a1.parseXsDateTime(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
    }
}
