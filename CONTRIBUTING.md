# Contribution Guidelines

## Getting Started

1. Fork the repository
2. Clone your fork locally
3. Create a new branch for your feature/fix
4. Make your changes
5. Test your changes thoroughly
6. Push to your branch
7. Create a Pull Request

## Code Style

- Follow Kotlin style conventions
- Use meaningful variable names
- Add comments for complex logic
- Keep functions focused and small

## Commit Messages

Format: `type(scope): description`

Examples:
- `feat(optimizer): add latency prediction algorithm`
- `fix(ui): correct cloud score display color`
- `docs: update installation instructions`
- `test: add network metrics unit tests`

Types: feat, fix, docs, style, test, refactor, chore

## Testing

- Write unit tests for new features
- Ensure all tests pass: `./gradlew test`
- Test on actual device when possible

## Pull Request Process

1. Update README.md with any new features
2. Ensure CI/CD pipeline passes
3. Request review from maintainers
4. Address feedback promptly
5. Once approved, merge your PR

## Reporting Issues

Include:
- Device model (e.g., "Logitech G Cloud")
- Android version
- Steps to reproduce
- Expected vs actual behavior
- Logs if applicable

Thank you for contributing to gEvE!
