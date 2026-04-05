package io.ktor.client.plugins;

import bv.f;
import bv.n;
import bx.a;
import com.ironsource.Me;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.plugins.HttpCallValidator;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.AttributeKey;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import kv.p;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class DefaultResponseValidationKt {
    private static final String BODY_FAILED_DECODING = "<body failed decoding>";
    private static final String DEPRECATED_EXCEPTION_CTOR = "Please, provide response text in constructor";
    private static final String NO_RESPONSE_TEXT = "<no response text provided>";
    private static final AttributeKey<x0> ValidateMark = new AttributeKey<>("ValidateMark");
    private static final a LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.DefaultResponseValidation");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        final /* synthetic */ HttpClientConfig<?> $this_addDefaultResponseValidation;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1", f = "DefaultResponseValidation.kt", i = {0, 0, 1, 1, 1}, l = {42, 48}, m = "invokeSuspend", n = {Me.f34938n, "statusCode", Me.f34938n, "exceptionResponse", "statusCode"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
        /* renamed from: io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05861 extends n implements p {
            int I$0;
            /* synthetic */ Object L$0;
            Object L$1;
            int label;

            public C05861(d<? super C05861> dVar) {
                super(2, dVar);
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                C05861 c05861 = new C05861(dVar);
                c05861.L$0 = obj;
                return c05861;
            }

            @Override // kv.p
            public final Object invoke(HttpResponse httpResponse, d<? super x0> dVar) {
                return ((C05861) create(httpResponse, dVar)).invokeSuspend(x0.f87415a);
            }

            /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:(1:(8:6|55|7|30|34|(2:39|(1:(1:48)(1:47))(1:43))(1:38)|49|50)(2:9|10))(1:11))(2:12|(2:14|15)(2:16|(1:51)(3:21|(1:24)|28)))|25|53|26|(6:29|30|34|(2:39|(1:(2:45|48)(0))(0))(0)|49|50)|28|(1:(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
            
                r0 = r1;
                r3 = r6;
                r1 = r11;
             */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00d3 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
            @Override // bv.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 293
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.DefaultResponseValidationKt.AnonymousClass1.C05861.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HttpClientConfig<?> httpClientConfig) {
            super(1);
            this.$this_addDefaultResponseValidation = httpClientConfig;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpCallValidator.Config) obj);
            return x0.f87415a;
        }

        public final void invoke(HttpCallValidator.Config HttpResponseValidator) {
            e0.checkNotNullParameter(HttpResponseValidator, "$this$HttpResponseValidator");
            HttpResponseValidator.setExpectSuccess(this.$this_addDefaultResponseValidation.getExpectSuccess());
            HttpResponseValidator.validateResponse(new C05861(null));
        }
    }

    public static final void addDefaultResponseValidation(HttpClientConfig<?> httpClientConfig) {
        e0.checkNotNullParameter(httpClientConfig, "<this>");
        HttpCallValidatorKt.HttpResponseValidator(httpClientConfig, new AnonymousClass1(httpClientConfig));
    }
}
