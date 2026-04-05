package pn;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import gn.z0;
import go.b0;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f81539a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // go.b0
    public Long parse(Uri uri, InputStream inputStream) throws IOException, NumberFormatException {
        String line = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)).readLine();
        try {
            Matcher matcher = f81539a.matcher(line);
            if (!matcher.matches()) {
                throw z0.createForMalformedManifest("Couldn't parse timestamp: " + line, null);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                long j11 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j11 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) * j10;
            }
            return Long.valueOf(time);
        } catch (ParseException e10) {
            throw z0.createForMalformedManifest(null, e10);
        }
    }
}
