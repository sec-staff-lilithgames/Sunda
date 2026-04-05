package kotlinx.serialization.json;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNamingStrategy;
import sv.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@ExperimentalSerializationApi
/* loaded from: classes10.dex */
public interface JsonNamingStrategy {
    public static final Builtins Builtins = Builtins.$$INSTANCE;

    String serialNameForJson(SerialDescriptor serialDescriptor, int i10, String str);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @ExperimentalSerializationApi
    public static final class Builtins {
        static final /* synthetic */ Builtins $$INSTANCE = new Builtins();
        private static final JsonNamingStrategy SnakeCase = new JsonNamingStrategy() { // from class: kotlinx.serialization.json.JsonNamingStrategy$Builtins$SnakeCase$1
            @Override // kotlinx.serialization.json.JsonNamingStrategy
            public String serialNameForJson(SerialDescriptor descriptor, int i10, String serialName) {
                e0.checkNotNullParameter(descriptor, "descriptor");
                e0.checkNotNullParameter(serialName, "serialName");
                return JsonNamingStrategy.Builtins.$$INSTANCE.convertCamelCase(serialName, '_');
            }

            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
            }
        };
        private static final JsonNamingStrategy KebabCase = new JsonNamingStrategy() { // from class: kotlinx.serialization.json.JsonNamingStrategy$Builtins$KebabCase$1
            @Override // kotlinx.serialization.json.JsonNamingStrategy
            public String serialNameForJson(SerialDescriptor descriptor, int i10, String serialName) {
                e0.checkNotNullParameter(descriptor, "descriptor");
                e0.checkNotNullParameter(serialName, "serialName");
                return JsonNamingStrategy.Builtins.$$INSTANCE.convertCamelCase(serialName, '-');
            }

            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.KebabCase";
            }
        };

        private Builtins() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String convertCamelCase(String str, char c10) {
            StringBuilder sb2 = new StringBuilder(str.length() * 2);
            Character chValueOf = null;
            int i10 = 0;
            for (int i11 = 0; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    if (i10 == 0 && sb2.length() > 0 && p0.last(sb2) != c10) {
                        sb2.append(c10);
                    }
                    if (chValueOf != null) {
                        sb2.append(chValueOf.charValue());
                    }
                    i10++;
                    chValueOf = Character.valueOf(Character.toLowerCase(cCharAt));
                } else {
                    if (chValueOf != null) {
                        if (i10 > 1 && Character.isLetter(cCharAt)) {
                            sb2.append(c10);
                        }
                        sb2.append(chValueOf.charValue());
                        chValueOf = null;
                        i10 = 0;
                    }
                    sb2.append(cCharAt);
                }
            }
            if (chValueOf != null) {
                sb2.append(chValueOf.charValue());
            }
            String string = sb2.toString();
            e0.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        public final JsonNamingStrategy getKebabCase() {
            return KebabCase;
        }

        public final JsonNamingStrategy getSnakeCase() {
            return SnakeCase;
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getKebabCase$annotations() {
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getSnakeCase$annotations() {
        }
    }
}
