package nextstep.subway.domain.exception;

public class SectionException extends DomainException {
    public SectionException(String message) {
        super(message);
    }

    public static class InvalidSectionException extends SectionException {
        public InvalidSectionException() {
            super("구간을 추가할 수 없습니다.");
        }
    }
}