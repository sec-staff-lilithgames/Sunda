package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00060\b\"\u0002H\u0006H\u0007¢\u0006\u0002\u0010\tJ-\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00060\b\"\u0002H\u0006H\u0007¢\u0006\u0002\u0010\tJ-\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00060\f\"\u0004\b\u0000\u0010\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00060\b\"\u0002H\u0006H\u0007¢\u0006\u0002\u0010\rJ6\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u00110\u000f\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0011\u0018\u00010\u000fH\u0007J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u0006H\u0007¨\u0006\u0014"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/MetaExoPlayerCustomizedCollections;", "", "<init>", "()V", "immutableListOf", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "elements", "", "([Ljava/lang/Object;)Ljava/util/List;", "immutableListCopyOf", "immutableSetOf", "", "([Ljava/lang/Object;)Ljava/util/Set;", "immutableMapCopyOf", "", "K", "V", "mapToCopy", "emptyList", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 0, 0}, xi = 48)
@MetaExoPlayerCustomization("On VRShell, Google Guava dependencies do not behave well. This is still under investigation but for now we are replacing those calls with vanilla java calls")
/* renamed from: com.facebook.ads.redexgen.X.i1, reason: from Kotlin metadata */
/* loaded from: assets/audience_network.dex */
public final class MetaExoPlayerCustomizedCollections {
    public static byte[] A00;
    public static final MetaExoPlayerCustomizedCollections A01;

    static {
        A06();
        A01 = new MetaExoPlayerCustomizedCollections();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{AbstractJsonLexerKt.TC_INVALID, 118, AbstractJsonLexerKt.TC_INVALID, 119, AbstractJsonLexerKt.TC_INVALID, 116, 110, 105};
    }

    @JvmStatic
    public static final <T> List<T> A01() {
        return A0.A06();
    }

    @JvmStatic
    public static final <T> List<T> A02(T... tArr) {
        C2628p6.A09(tArr, A00(0, 8, 96));
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length);
        return new ArrayList(A0.A07(Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
    }

    @JvmStatic
    public static final <T> List<T> A03(T... tArr) {
        C2628p6.A09(tArr, A00(0, 8, 96));
        return new ArrayList(A0.A07(Arrays.copyOf(tArr, tArr.length)));
    }

    @JvmStatic
    public static final <K, V> Map<K, V> A04(Map<K, ? extends V> map) {
        return new HashMap(map);
    }

    @JvmStatic
    public static final <T> Set<T> A05(T... tArr) {
        C2628p6.A09(tArr, A00(0, 8, 96));
        return new HashSet(A0.A07(Arrays.copyOf(tArr, tArr.length)));
    }
}
