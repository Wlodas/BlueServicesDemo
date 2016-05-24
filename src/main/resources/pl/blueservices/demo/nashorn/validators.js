var regexp = /[0-9]{2}-[0-9]{3}/;

function validate(input) {
	return regexp.test(input);
}