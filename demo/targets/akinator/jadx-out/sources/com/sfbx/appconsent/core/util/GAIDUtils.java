package com.sfbx.appconsent.core.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import ov.g;
import qv.c;
import qv.m;
import uu.j1;
import uu.q0;
import uu.y0;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GAIDUtils {
    private static final String CHARS_POOL = "abcdef0123456789";
    public static final GAIDUtils INSTANCE = new GAIDUtils();
    private static final String REGEX = "^[0-9a-fA-F]{8}\\b-[0-9a-fA-F]{4}\\b-[0-9a-fA-F]{4}\\b-[0-9a-fA-F]{4}\\b-[0-9a-fA-F]{12}$";
    private static final Pattern PATTERN = Pattern.compile(REGEX);
    private static final String REGEX_FORBIDDEN = "^(0{8}|1{8}|2{8}|3{8}|4{8}|5{8}|6{8}|7{8}|8{8}|9{8})\\b-(0{4}|1{4}|2{4}|3{4}|4{4}|5{4}|6{4}|7{4}|8{4}|9{4})\\b-(0{4}|1{4}|2{4}|3{4}|4{4}|5{4}|6{4}|7{4}|8{4}|9{4})\\b-(0{4}|1{4}|2{4}|3{4}|4{4}|5{4}|6{4}|7{4}|8{4}|9{4})\\b-(0{12}|1{12}|2{12}|3{12}|4{12}|5{12}|6{12}|7{12}|8{12}|9{12})$";
    private static final Pattern PATTERN_FORBIDDEN = Pattern.compile(REGEX_FORBIDDEN);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum AppKeyErrorType {
        INVALID_UUID,
        FORBIDDEN_UUID
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class Response {
        public static final Companion Companion = new Companion(null);

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final Response buildResponse(boolean z10, boolean z11) {
                return (!z10 || z11) ? z11 ? new Error(AppKeyErrorType.FORBIDDEN_UUID) : new Error(AppKeyErrorType.INVALID_UUID) : Success.INSTANCE;
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Error extends Response {
            private final AppKeyErrorType errorType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(AppKeyErrorType errorType) {
                super(null);
                e0.checkNotNullParameter(errorType, "errorType");
                this.errorType = errorType;
            }

            public final AppKeyErrorType getErrorType() {
                return this.errorType;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Success extends Response {
            public static final Success INSTANCE = new Success();

            private Success() {
                super(null);
            }
        }

        public /* synthetic */ Response(u uVar) {
            this();
        }

        private Response() {
        }
    }

    private GAIDUtils() {
    }

    private final String buildUUIDFromInputString(String str) {
        String str2 = str.subSequence(0, 8) + "-" + str.subSequence(8, 12) + "-" + str.subSequence(12, 16) + "-" + str.subSequence(16, 20) + "-" + str.subSequence(20, 32);
        e0.checkNotNullExpressionValue(str2, "stringBuilder.toString()");
        return str2;
    }

    private final String generateRandomString() {
        List listPlus = y0.plus((Iterable) new c('a', 'f'), (Iterable) new c('0', '9'));
        ArrayList arrayList = new ArrayList(32);
        for (int i10 = 0; i10 < 32; i10++) {
            Character ch2 = (Character) y0.random(listPlus, g.f79860b);
            ch2.charValue();
            arrayList.add(ch2);
        }
        return y0.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    private final String generateUUIDFromUUIDApi() {
        return i.c("randomUUID().toString()");
    }

    private final boolean isUUID(String str) {
        return PATTERN.matcher(str).matches();
    }

    private final boolean isUUIDForbidden(String str) {
        return PATTERN_FORBIDDEN.matcher(str).matches();
    }

    private final String randomStringByKotlinRandom() {
        m mVar = new m(1, 32);
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(mVar, 10));
        Iterator it = mVar.iterator();
        while (it.hasNext()) {
            ((j1) it).nextInt();
            arrayList.add(Character.valueOf(CHARS_POOL.charAt(g.f79860b.nextInt(0, 16))));
        }
        return y0.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    public final String generateNameUUIDFromBytes$appconsent_core_prodXchangeRelease() {
        String strRandomStringByKotlinRandom = randomStringByKotlinRandom();
        byte[] bytes = strRandomStringByKotlinRandom.getBytes(sv.g.f86134b);
        e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        try {
            String string = UUID.nameUUIDFromBytes(bytes).toString();
            e0.checkNotNullExpressionValue(string, "nameUUIDFromBytes(toByteArray).toString()");
            return e0.areEqual(isValidUUID(string), Response.Success.INSTANCE) ? string : buildUUIDFromInputString(strRandomStringByKotlinRandom);
        } catch (Throwable unused) {
            return buildUUIDFromInputString(strRandomStringByKotlinRandom);
        }
    }

    public final String generateRandomUUID$appconsent_core_prodXchangeRelease() {
        try {
            String strGenerateUUIDFromUUIDApi = generateUUIDFromUUIDApi();
            Response responseIsValidUUID = isValidUUID(strGenerateUUIDFromUUIDApi);
            Response.Success success = Response.Success.INSTANCE;
            if (e0.areEqual(responseIsValidUUID, success)) {
                return strGenerateUUIDFromUUIDApi;
            }
            String strBuildUUIDFromInputString = buildUUIDFromInputString(generateRandomString());
            return e0.areEqual(isValidUUID(strBuildUUIDFromInputString), success) ? strBuildUUIDFromInputString : generateNameUUIDFromBytes$appconsent_core_prodXchangeRelease();
        } catch (Throwable unused) {
            return generateNameUUIDFromBytes$appconsent_core_prodXchangeRelease();
        }
    }

    public final Response isValidUUID(String uuidToTest) {
        e0.checkNotNullParameter(uuidToTest, "uuidToTest");
        return Response.Companion.buildResponse(isUUID(uuidToTest), isUUIDForbidden(uuidToTest));
    }
}
