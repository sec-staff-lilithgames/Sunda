package bd;

import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class w extends y0 implements zc.j {

    /* renamed from: f, reason: collision with root package name */
    public static final w f9146f = new w(Number.class);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9147e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends e1 {

        /* renamed from: e, reason: collision with root package name */
        public static final a f9148e = new a();

        public a() {
            super(BigDecimal.class);
        }

        @Override // bd.e1, jc.w
        public boolean isEmpty(jc.u0 u0Var, Object obj) {
            return false;
        }

        @Override // bd.e1, bd.z0, jc.w
        public void serialize(Object obj, ub.o oVar, jc.u0 u0Var) throws IOException {
            String string;
            if (oVar.isEnabled(ub.n.WRITE_BIGDECIMAL_AS_PLAIN)) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                int iScale = bigDecimal.scale();
                if (iScale < -9999 || iScale > 9999) {
                    u0Var.reportMappingProblem(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(bigDecimal.scale()), 9999, 9999), new Object[0]);
                }
                string = bigDecimal.toPlainString();
            } else {
                string = obj.toString();
            }
            oVar.writeString(string);
        }

        @Override // bd.e1
        public String valueToString(Object obj) {
            throw new IllegalStateException();
        }
    }

    public w(Class<? extends Number> cls) {
        super(cls);
        this.f9147e = cls == BigInteger.class;
    }

    public static jc.w bigDecimalAsStringSerializer() {
        return a.f9148e;
    }

    @Override // bd.y0, bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        if (this.f9147e) {
            hVar.expectIntegerFormat(oVar);
        } else if (handledType() == BigDecimal.class) {
            hVar.expectNumberFormat(oVar);
        } else {
            hVar.expectNumberFormat(oVar);
        }
    }

    @Override // zc.j
    public jc.w createContextual(jc.u0 u0Var, jc.g gVar) throws jc.r {
        tb.t tVarC = z0.c(handledType(), u0Var, gVar);
        return (tVarC == null || tVarC.getShape().ordinal() != 5) ? this : handledType() == BigDecimal.class ? bigDecimalAsStringSerializer() : d1.f9070e;
    }

    @Override // bd.y0, bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type) {
        return z0.a(this.f9147e ? "integer" : "number");
    }

    @Override // bd.z0, jc.w
    public void serialize(Number number, ub.o oVar, jc.u0 u0Var) throws IOException {
        if (number instanceof BigDecimal) {
            oVar.writeNumber((BigDecimal) number);
            return;
        }
        if (number instanceof BigInteger) {
            oVar.writeNumber((BigInteger) number);
            return;
        }
        if (number instanceof Long) {
            oVar.writeNumber(number.longValue());
            return;
        }
        if (number instanceof Double) {
            oVar.writeNumber(number.doubleValue());
            return;
        }
        if (number instanceof Float) {
            oVar.writeNumber(number.floatValue());
        } else if ((number instanceof Integer) || (number instanceof Byte) || (number instanceof Short)) {
            oVar.writeNumber(number.intValue());
        } else {
            oVar.writeNumber(number.toString());
        }
    }
}
