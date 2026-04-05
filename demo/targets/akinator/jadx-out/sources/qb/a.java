package qb;

import org.w3c.dom.Document;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a extends z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(lb.e session, String objectId, String questionId, String answer) {
        super(session);
        kotlin.jvm.internal.e0.checkNotNullParameter(session, "session");
        kotlin.jvm.internal.e0.checkNotNullParameter(objectId, "objectId");
        kotlin.jvm.internal.e0.checkNotNullParameter(questionId, "questionId");
        kotlin.jvm.internal.e0.checkNotNullParameter(answer, "answer");
        this.f82730i = "add_answer_question.php";
        addParameter("object_id", objectId);
        addParameter("question_id", questionId);
        addParameter("answer", answer);
    }

    @Override // qb.z
    public void parseAkWSResponse(Document xmlResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
    }
}
