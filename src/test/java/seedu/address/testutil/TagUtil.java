package seedu.address.testutil;

import static seedu.address.logic.parser.CliSyntax.PREFIX_FILE_ADDRESS;
import static seedu.address.logic.parser.CliSyntax.PREFIX_TAG_NAME;

import seedu.address.logic.commands.TagCommand;
import seedu.address.model.tag.Tag;


/**
 * A utility class for Tag.
 */
public class TagUtil {

    /**
     * Returns an add command string for adding the {@code tag}.
     */
    public static String getTagCommand(Tag tag) {
        return TagCommand.COMMAND_WORD + " " + getTagDetails(tag);
    }

    /**
     * Returns the part of command string for the given {@code tag}'s details.
     */
    public static String getTagDetails(Tag tag) {
        StringBuilder sb = new StringBuilder();
        sb.append(PREFIX_TAG_NAME + tag.getTagName().tagName + " ");
        sb.append(PREFIX_FILE_ADDRESS + tag.getFileAddress().value + " ");
        return sb.toString();
    }
}
