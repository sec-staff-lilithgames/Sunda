package gatewayprotocol.v1;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class AdFormatOuterClass {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum AdFormat implements Internal.EnumLite {
        AD_FORMAT_UNSPECIFIED(0),
        AD_FORMAT_INTERSTITIAL(1),
        AD_FORMAT_REWARDED(2),
        AD_FORMAT_BANNER(3),
        UNRECOGNIZED(-1);

        public static final int AD_FORMAT_BANNER_VALUE = 3;
        public static final int AD_FORMAT_INTERSTITIAL_VALUE = 1;
        public static final int AD_FORMAT_REWARDED_VALUE = 2;
        public static final int AD_FORMAT_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<AdFormat> internalValueMap = new a();
        private final int value;

        AdFormat(int i10) {
            this.value = i10;
        }

        public static AdFormat forNumber(int i10) {
            if (i10 == 0) {
                return AD_FORMAT_UNSPECIFIED;
            }
            if (i10 == 1) {
                return AD_FORMAT_INTERSTITIAL;
            }
            if (i10 == 2) {
                return AD_FORMAT_REWARDED;
            }
            if (i10 != 3) {
                return null;
            }
            return AD_FORMAT_BANNER;
        }

        public static Internal.EnumLiteMap<AdFormat> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f57485a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static AdFormat valueOf(int i10) {
            return forNumber(i10);
        }
    }

    private AdFormatOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
